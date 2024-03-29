# Etapa de construcción
FROM maven:3.6.3-openjdk-17-slim AS build
WORKDIR /ms-login

# Copia el archivo pom.xml y restaura las dependencias como una capa distinta
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia el resto de tu aplicación y constrúyela
COPY src ./src
RUN mvn package -DskipTests

# Etapa final / imagen
FROM openjdk:11-jre-slim
WORKDIR /ms-login

# Copia el jar de la etapa de construcción al directorio de trabajo
COPY --from=build /ms-login/target/*.jar ms-security.jar

ENTRYPOINT ["java", "-jar", "ms-security.jar"]