FROM frolvlad/alpine-java:jre8-slim

RUN  mkdir -p /app/logs
COPY target/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8000

