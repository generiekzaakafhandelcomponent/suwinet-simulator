FROM openjdk:17.0.1-slim

ADD /build/libs/suwitense-web-service-0.0.1-SNAPSHOT.jar /opt/app.jar

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]