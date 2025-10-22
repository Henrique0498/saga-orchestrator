FROM gradle:8.5-jdk17 AS builder
WORKDIR /home/gradle/project
COPY . .
RUN gradle clean build --no-daemon

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
