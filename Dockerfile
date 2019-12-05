
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} amaven-web-app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-war","/maven-web-app.war"]
