FROM eclipse-temurin:21-jre-noble

RUN groupadd --system --gid 10001 app \
    && useradd --system --uid 10001 --gid app --no-create-home --shell /usr/sbin/nologin app

COPY --chmod=0444 /build/libs/suwinet-simulator-local-1.0.0-SNAPSHOT.jar /opt/app.jar

USER 10001:10001

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
