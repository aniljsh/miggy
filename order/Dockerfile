# Use an official OpenJDK base image
FROM openjdk:17

# Set the working directory within the image
WORKDIR /opt

# Copy JAR files from the host system into the image
COPY target/*.jar /opt/app.jar

# Define the command to run when the container starts
CMD ["java", "-jar", "app.jar"]


## docker image created with follwoing command
### sudo docker build . -t eureka:v1   