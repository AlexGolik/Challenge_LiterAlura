```markdown

# Descripción del Proyecto
Este proyecto es una aplicación basada en Java que utiliza Spring Boot y Maven. Se conecta a una base de datos PostgreSQL e integra una API externa.

```markdown
![Descripción del Proyecto](literalura.png)
```

## Documentación

## Configuración
La configuración de la aplicación se gestiona a través del archivo `application.properties`.

### Configuración de la Base de Datos
- `spring.datasource.url`: URL de la base de datos PostgreSQL.
- `spring.datasource.username`: Nombre de usuario de la base de datos.
- `spring.datasource.password`: Contraseña de la base de datos.
- `spring.datasource.driver-class-name`: Nombre de la clase del controlador de la base de datos.

### Configuración de JPA
- `spring.jpa.hibernate.ddl-auto`: Modo DDL de Hibernate.
- `spring.jpa.properties.hibernate.dialect`: Dialecto de Hibernate para PostgreSQL.

### Integración de la API
- `integration.api.base-path`: Ruta base para la API externa.

## Construcción y Ejecución
Para construir y ejecutar el proyecto, use los siguientes comandos de Maven:
```sh
mvn clean install
mvn spring-boot:run
```

## Configuración de Git
El proyecto utiliza `.gitattributes` y `.gitignore` para gestionar la configuración de Git y los archivos ignorados.


