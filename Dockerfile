# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/springboot-image-new.jar /app/springboot-image-new.jar

# Expose the port that your application runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "studentapp-0.0.1-SNAPSHOT.jar"]