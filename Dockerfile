# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the main application pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the main application
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the built artifacts from the build stage
# Quarkus uses fast-jar format by default which creates a quarkus-app directory
COPY --from=build /app/target/quarkus-app/lib/ /app/lib/
COPY --from=build /app/target/quarkus-app/*.jar /app/
COPY --from=build /app/target/quarkus-app/app/ /app/app/
COPY --from=build /app/target/quarkus-app/quarkus/ /app/quarkus/

# Configure the port for Render
# Render automatically sets the PORT environment variable, so we configure Quarkus to use it
ENV QUARKUS_HTTP_PORT=${PORT:-8083}
ENV QUARKUS_HTTP_HOST=0.0.0.0

# Ensure the uploads directory exists for file parsing
RUN mkdir -p /app/uploads && chmod 777 /app/uploads

# Start the Quarkus application
CMD ["java", "-jar", "/app/quarkus-run.jar"]
