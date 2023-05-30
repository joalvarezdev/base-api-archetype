## Arquetipo base Spring-Boot

---

### Instalación

Luego de clonar el repositorio ingrese al mismo, tiene que tener instalado maven en algunas de sus versiones.
En la terminal ejecute el siguiente comando.

```bash
mvn clean install
```

Luego de la instalación ya tendra disponible en su catalogo local el proyecto.

--- 

### Uso

En la terminal elija el directorio donde desea crear el proyecto y ejecute el siguiente comando:

```bash
mvn archetype:generate
```

Siga las instrucciones interactivas de maven:
    - groupId: com.example
    - artifactId: Manera unica con la cual sera identificado su proyecto, este sera utilizado para darle nombre cuando se genere su archivo JAR
    - package: Nombre completo del paquete en el cual desea trabajar. Ej: com.example.proyecto
    - databaseName: Nombre de la base de datos. El arquetipo por defecto tiene dependencias **PostgreSQL**.

