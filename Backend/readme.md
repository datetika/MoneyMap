

### Consultar datos de base de datos personas
http://localhost:8080/personas


# Proyecto Spring Boot - MoneyMap

Este es un proyecto de Spring Boot  

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener las siguientes herramientas instaladas en tu sistema:

- [Java 21 o superior](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/) o [Gradle](https://gradle.org/) (dependiendo de cuál uses en tu proyecto)

## Configuración de la base de datos

Configurar base de datos  **H2** como base de datos en memoria.  

Habilita la consola de H2 en `application.properties`:

```properties
# Configuración de la base de datos H2 en memoria
spring.datasource.url=jdbc:h2:mem:testdb   # Nombre de la base de datos en memoria
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Configuración de Hibernate
spring.jpa.hibernate.ddl-auto=update  # Crea o actualiza las tablas según las entidades

# H2 Console (opcional, para acceso web a la base de datos)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

```








****  Generar Spring project using https://start.spring.io/ website
