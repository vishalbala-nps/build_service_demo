FROM openjdk:8-jre-alpine
RUN mkdir -p /app
WORKDIR /app
COPY target/build-service-demo-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]