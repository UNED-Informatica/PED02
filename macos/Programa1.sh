#!/bin/bash
# Cambia al directorio del script
cd "$(dirname "$0")"
cd ..

# Ejecuta el programa con el JRE incluido para macOS
./jre-macos/bin/java -jar java/PED02_01.jar
