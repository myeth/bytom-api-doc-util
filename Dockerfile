FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/bytom-api-doc.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]