# Minimal configuration based Docker file for the sample microservice

FROM openjdk:8-jdk-alpine

MAINTAINER Chamantha De Silva

RUN mkdir -p /usr/src/gdg

COPY ./target/gdg-demo-0.0.1-SNAPSHOT.jar /usr/src/gdg

WORKDIR /usr/src/gdg

EXPOSE 8080

CMD ["java", "-jar","gdg-demo-0.0.1-SNAPSHOT.jar"]
