FROM openjdk:11-jre

EXPOSE 8080

ADD build/libs/microservicio-spring-0.0.1-SNAPSHOT-plain.jar /app/microservicio-spring-0.0.1-SNAPSHOT-plain.jar

WORKDIR /app

CMD java -jar microservicio-spring-0.0.1-SNAPSHOT-plain.jar
