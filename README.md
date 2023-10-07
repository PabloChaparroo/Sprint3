# Sprint 3️⃣

**Integrantes:**
- Saavedra Francisco 48980
- Ivani Franco 48841
- Miranda Valentin 48956
- Chaparro Pablo 47742
- Fernandez Bernardo 48835

**Desarrollo y Configuración del Proyecto:**
Partiendo del Diagrama de Clases del Tp de Ingenieria Inversa, realizamos ajustes significativos, como:

- Modificaciones en la multiplicidad en algunas relaciones.
- Ajustes en la navegabilidad de ciertas relaciones.
- Exclusión de la clase Rol del Diagrama.
- Correcta vinculación de los Enum.

La creación del proyecto Spring Boot se llevó a cabo en [Spring Initializer](https://start.spring.io/), con la inclusión de las siguientes dependencias en el archivo `build.gradle`:

- Spring Boot Starter Data JPA
- Spring Boot Starter Data REST
- Spring Boot Starter Web
- Lombok
- Spring Boot DevTools
- H2 Database (en tiempo de ejecución)
- Spring Boot Starter Test

Posteriormente, configuramos la base de datos H2 en `application.properties`.

Procedimos con la creación de los siguientes paquetes:
- entities
- repositories

Luego, desarrollamos las clases y aplicamos las anotaciones correspondientes de las bibliotecas de JPA y Lombok.

A continuación, definimos las relaciones pertinentes entre las clases mediante las anotaciones de JPA:
- `@OneToOne`
- `@OneToMany`
- `@ManyToOne`
- `@ManyToMany`

Finalmente, en el archivo principal (main), establecimos algunos objetos para verificar el correcto funcionamiento del proyecto y de la base de datos H2.
