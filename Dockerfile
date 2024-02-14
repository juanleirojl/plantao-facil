FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY . .
RUN ./mvnw clean install -DskipTests
ENTRYPOINT ["java","-jar","target/plantao-facil-0.0.1-SNAPSHOT.jar"]