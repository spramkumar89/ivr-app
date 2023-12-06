FROM tomcat
EXPOSE 8080
COPY target/ivr-app-0.0.1.war /usr/local/tomcat/webapps/