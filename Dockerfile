FROM openjdk:11
ADD target/docker-maple-ec.jar docker-maple-ec.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-maple-ec.jar"]