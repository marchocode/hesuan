FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar

ENV SPRING_PROFILES_ACTIVE=prod

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]