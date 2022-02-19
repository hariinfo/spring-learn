#docker build -t spring-jdbc-firefly:1.0 .
FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]