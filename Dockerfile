FROM openjdk:17
COPY target/Docker-0.0.1-SNAPSHOT.jar Docker-0.0.1-SNAPSHOT.jar
CMD java -jar Docker-0.0.1-SNAPSHOT.jar