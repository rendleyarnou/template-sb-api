FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/template-sb-api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

ENTRYPOINT ["top", "-b"]