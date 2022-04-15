FROM openjdk:11.0-jre-bullseye as build
ENV SERVER_PORT=8080
RUN adduser --system --group spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE ${SERVER_PORT}
ENTRYPOINT ["java","-jar","/app.jar"]