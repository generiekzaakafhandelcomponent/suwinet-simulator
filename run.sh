#!/usr/bin/env bash
# Start de suwinet-simulator (incl. response-editor) als zelfstandige jar in de
# voorgrond. Voordeel t.o.v. `gradlew bootRun`: het app-proces is een direct
# kind van deze shell, dus Ctrl+C stopt het meteen en netjes — geen lingering
# JVM die poort 8090 vasthoudt.
#
# Editor-UI: http://localhost:8090/responses/   ·   API: /admin/responses
#
# Een afwijkend Responses-pad doorgeven kan via een argument, dat wordt
# doorgegeven aan de app:
#   ./run.sh --simulator.responses.path=/absoluut/pad/naar/Responses
set -euo pipefail

cd "$(dirname "$0")"

# Haal een eventuele JENV_VERSION-override uit de omgeving, zodat jenv de versie
# uit .java-version (17) gebruikt — de versie waar dit project op bouwt.
unset JENV_VERSION

PORT=8090

# Vangnet: mocht er nog een oude JVM op de poort hangen, ruim die eerst op.
# LET OP: -sTCP:LISTEN is essentieel. Zonder die filter geeft lsof óók PIDs
# terug van processen met een *bestaande verbinding* naar poort 8090 — o.a.
# com.docker.backend wanneer een container met de app praat. Een ongefilterde
# `kill -9` nekt dan Docker Desktop (moet daarna herstart worden).
if lsof -ti "tcp:${PORT}" -sTCP:LISTEN >/dev/null 2>&1; then
  echo "Poort ${PORT} is nog bezet — oud proces wordt gestopt..."
  lsof -ti "tcp:${PORT}" -sTCP:LISTEN | xargs kill -9 2>/dev/null || true
fi

echo "Bouwen (bootJar)..."
./gradlew bootJar

# De bootJar is de enige jar in build/libs die niet op -plain.jar eindigt.
JAR="$(ls build/libs/*.jar | grep -v -- '-plain\.jar$' | head -n1)"
if [[ -z "${JAR:-}" ]]; then
  echo "Geen bootJar gevonden in build/libs" >&2
  exit 1
fi

echo "Starten: ${JAR}"
echo "UI: http://localhost:${PORT}/responses/"
echo "Stop met Ctrl+C."
exec java -jar "${JAR}" "$@"
