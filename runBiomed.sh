#!/bin/bash

# Instalar Git si no está instalado
if ! command -v git &> /dev/null
then
    echo "Git no está instalado. Instalando..."
    sudo apt-get install git -y
fi

# Instalar Gradle si no está instalado
if ! command -v gradle &> /dev/null
then
    echo "Gradle no está instalado. Instalando..."
    sudo apt-get install gradle -y
fi

# Clonar el repositorio
git clone https://github.com/zarhell/patrones-disennopoc.git
cd patrones-disennopoc

# Ejecutar los comandos de Gradle
./gradlew clean
./gradlew build -x test
./gradlew bootRun --debug-jvm