FROM eclipse-temurin:17-jre-noble

ADD /build/libs/suwinet-simulator-local-1.0.0-SNAPSHOT.jar /opt/app.jar

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
