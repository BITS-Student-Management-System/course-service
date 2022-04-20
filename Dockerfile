FROM adoptopenjdk/openjdk14:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} course-service.jar
ENTRYPOINT ["java","-jar","/course-service.jar"]
EXPOSE 9003