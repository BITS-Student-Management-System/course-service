#define base docker image
FROM openjdk:8-jdk-alpine
LABEL maintainer="roopika.srinivas"
ADD target/course-service-0.0.1-SNAPSHOT.jar course-service.jar
ENTRYPOINT ["java","-jar","course-service.jar"]
