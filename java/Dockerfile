# define a first stage with only build deps
FROM maven:3.6.3-openjdk-8 AS builder

# set workdir
WORKDIR /app

# copy the Project Object Model file
COPY ./pom.xml ./pom.xml

# fetch all dependencies and plugins based on the pom file
RUN mvn dependency:go-offline

# copy your other files
COPY ./src ./src

# build
RUN mvn package && cp target/sonar-secrets-java-*.jar ./app.jar

# define a final stage from the runtime image
FROM openjdk:11-jre-slim

# copy only the jar file
COPY --from=builder /app/app.jar /output/app.jar 

# set the startup command to run your binary
CMD ["/bin/sh"]