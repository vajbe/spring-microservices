# Step 1: Build stage
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set working directory in the container
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the rest of the application code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Step 2: Run stage
FROM eclipse-temurin:17-jdk-alpine

# Set working directory in the container
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/loans-0.0.1-SNAPSHOT.jar /app/loans-0.0.1-SNAPSHOT.jar

# Expose the port the Spring Boot app runs on
EXPOSE 8090

RUN apk --no-cache add curl

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "/app/loans-0.0.1-SNAPSHOT.jar"]
