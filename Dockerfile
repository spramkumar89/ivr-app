FROM openjdk:17-jdk-alpine3.14
MAINTAINER Ramkumar
COPY target/ivr-app-0.0.1.war ivr-app-0.0.1.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ivr-app-0.0.1.war"]