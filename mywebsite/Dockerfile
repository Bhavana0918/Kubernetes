FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/mywebsite-0.0.1-SNAPSHOT.jar.original /app/mywebsite.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/mywebsite.jar"]

