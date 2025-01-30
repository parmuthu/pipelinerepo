# Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 9080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
