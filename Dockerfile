# package phase
FROM openjdk:19-jdk-alpine
ARG JAR_FILE=ap-khazanah-service/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]