FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
COPY --from=build target/MockDataServiceApplication-1.0-SNAPSHOT.jar app.jar
EXPOSE 10002
ENTRYPOINT ["java", "-jar", "app.jar"]