# BioMedManager

BioMedManager es una aplicación basada en Java diseñada para gestionar equipos biomédicos de manera eficiente en instituciones de salud. La aplicación utiliza varios patrones de diseño y sigue una arquitectura hexagonal para garantizar la mantenibilidad, escalabilidad y robustez.

## Tabla de Contenidos

- [Características](#características)
- [Patrones de Diseño](#patrones-de-diseño)
- [Arquitectura Hexagonal](#arquitectura-hexagonal)
- [Instalación](#instalación)
- [Uso](#uso)
- [Endpoints](#endpoints)


## Características

- **Registro de Equipos**: Agregar y gestionar detalles de equipos biomédicos.
- **Sistema de Notificaciones**: Notificar a los departamentos relevantes sobre nuevos equipos.
- **Gestión de Mantenimiento**: Implementar estrategias de mantenimiento preventivo y correctivo#!/bin/bash

# Instalar Git si no está instalado
   ```sh
if ! command -v git &> /dev/null
then
    echo "Git no está instalado. Instalando..."
    sudo apt-get install git -y
fi
   ```


# Instalar Gradle si no está instalado
   ```sh
   if ! command -v gradle &> /dev/null
then
    echo "Gradle no está instalado. Instalando..."
    sudo apt-get install gradle -y
fi
   ```

# Clonar el repositorio

   ```sh
git clone https://github.com/zarhell/patrones-disennopoc.git
cd patrones-disennopoc
   ```

## Ejecución del Proyecto con el Script Bash

Para facilitar la ejecución del proyecto, ejecutar un script Bash llamado `runBiomed.sh`. del directgorio raiz.
Este script automatiza la instalación de las dependencias necesarias, la clonación del repositorio y la ejecución del proyecto.

Para usar este script, user el comando `./runBiomed.sh`.

El script verificará si Git y Gradle están instalados en tu sistema. Si no están instalados, el script intentará instalarlos. Luego, el script clonará el repositorio, navegará al directorio del proyecto, y ejecutará los comandos `clean`, `build -x test`, y `bootRun` en modo debug.

# Persistencia

- **Base de Datos Embebida**: Utiliza la base de datos H2 en memoria para facilitar la configuración y portabilidad.
- **Consola Web**: Consola web de la base de datos H2 para una fácil inspección de datos.

## Patrones de Diseño

La aplicación utiliza varios patrones de diseño para garantizar un código limpio y mantenible:

- **Singleton**: Garantiza una única instancia de la conexión a la base de datos.
  - **Uso**: Clase `DatabaseConnection`.
- **Builder**: Facilita la construcción de objetos `Equipment` complejos.
  - **Uso**: Clase `EquipmentBuilder`.
- **DAO (Data Access Object)**: Abstrae la capa de persistencia de datos.
  - **Uso**: Interfaz `EquipmentDAO` y clase `EquipmentDAOImpl`.
- **Composite**: Gestiona grupos de equipos como una sola entidad.
  - **Uso**: Clases `EquipmentComponent`, `SingleEquipment` y `EquipmentGroup`.
- **Adapter**: Integra sistemas de equipos heredados.
  - **Uso**: Clases `EquipmentAdapter` y `LegacyEquipmentService`.
- **Strategy**: Implementa diferentes estrategias de mantenimiento.
  - **Uso**: Interfaces `MaintenanceStrategy`, `PreventiveMaintenance` y `CorrectiveMaintenance`.
- **Observer**: Notifica a los departamentos sobre actualizaciones de equipos.
  - **Uso**: Interfaces `ObserverPoc`, `Subject`, `EquipmentManager` y `MaintenanceDepartment`.

## Arquitectura Hexagonal

La arquitectura hexagonal (también conocida como puertos y adaptadores) garantiza que la lógica central de la aplicación esté aislada de sistemas externos como bases de datos y marcos web. Este enfoque mejora la testabilidad y mantenibilidad.

## Instalación

### Requisitos Previos

- Java 11 o superior
- Gradle

### Pasos

1. Clona el repositorio:
   ```sh
   git clone https://github.com/zarhell/patrones-disennopoc.git
   cd patrones-disennopoc
   ```

2. Limpia el proyecto:
   ```sh
   ./gradlew clean
   ```

3. Compila el proyecto:
   ```sh
   ./gradlew build
   ```

4. Ejecuta la aplicación:
   ```sh
   ./gradlew bootRun
   ```

## Uso

Una vez que la aplicación esté en funcionamiento, puedes interactuar con ella utilizando la API REST proporcionada.

## Endpoints

### Registrar Equipo
```sh
curl -X POST http://localhost:8080/api/equipments \
-H "Content-Type: application/json" \
-d '{
  "id": "123",
  "name": "CT Scanner",
  "model": "Model X",
  "serialNumber": "SN123456",
  "acquisitionDate": "2024-05-01T00:00:00Z"
}'
```

### Obtener Equipo por ID
```sh
curl -X GET http://localhost:8080/api/equipments/123
```

### Obtener Todos los Equipos
```sh
curl -X GET http://localhost:8080/api/equipments
```

### Enviar Notificación
```sh
curl -X POST http://localhost:8080/api/notifications/Equipment%20registered%20successfully
```


