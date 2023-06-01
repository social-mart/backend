FROM openjdk:17
WORKDIR /app
COPY build/libs/gateway-application-*-boot.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
