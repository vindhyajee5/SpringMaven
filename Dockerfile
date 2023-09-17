FROM openjdk:11
LABEL maintainer ="vindhyachal"
ADD target/SpringBootMaven-0.0.1-SNAPSHOT.jar SpringBootMaven-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringBootMaven-0.0.1-SNAPSHOT.jar"]
