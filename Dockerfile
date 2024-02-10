FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
COPY target/spring-jenkins-test.jar spring-jenkins-test.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-test.jar"]