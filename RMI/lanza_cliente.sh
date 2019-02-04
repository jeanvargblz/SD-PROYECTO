#!/bin/bash

clear

echo "Lanzando cliente..."

java -cp ./ -Djava.security.policy=server.policy VentanaRegistrar

echo "Ejecución terminada"
