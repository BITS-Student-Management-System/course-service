FROM openjdk:8
EXPOSE 9003
# Install maven
RUN apt-get update -y
RUN apt-get install -y maven

# Creating working directory
WORKDIR /app

# Add src to working directory
ADD pom.xml /app/pom.xml
ADD src /app/src

# Build JAR
RUN mvn package -DskipTests=true

# Start app
ENTRYPOINT ["java","-jar","/app/target/course-service-0.0.1-SNAPSHOT.jar"]