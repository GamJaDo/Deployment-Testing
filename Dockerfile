# Base image for running Java applications
FROM eclipse-temurin:21-jre-alpine

# Set working directory
WORKDIR /app

# Copy the boot jar to the container
COPY C:/Users/ByungSoo/Desktop/docker-test/build/libs/*.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
