FROM openjdk:17
COPY target/BookingCinemaHall-1-0.0.1-SNAPSHOT.jar BookingCinemaHall-1-0.0.1-SNAPSHOT.jar
COPY src/main/resources/application.properties /app/config/application.properties
CMD java -jar BookingCinemaHall-1-0.0.1-SNAPSHOT.jar