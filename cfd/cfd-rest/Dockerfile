FROM registry.cn-hongkong.aliyuncs.com/snapex/opera/alpine-jdk-arthas:1.0.0

RUN  mkdir -p /app/logs
COPY target/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8020 8025

