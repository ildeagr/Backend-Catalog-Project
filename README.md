# Proyecto Gestión de Catálogo (Backend Spring Boot)
## Objetivo:
Proyecto propio de desarrollo de "Microservicio Catálogo" (Java/Spring Boot): API RESTful que gestiona un catálogo de productos en una base de datos MySQL. Permite a las aplicaciones enviar peticiones
@get, @put, @post y @delete sobre la base de datos de manera eficiente y segura, realizando consultas, modificaciones o ampliaciones del catalogo de productos.

## Sobre mi participacion y Logros:
He desarrollado en su totalidad esta parte de backend con Spring Boot y MySQL. Esto me ha ayudado a conseguir:

1. Conocimientos sólidos en microservicios.
2. Aprender a configurar y realizar peticiones Restful.
3. Integrar todo esto con una BBDD SQL real.
4. Realizar pruebas de Testing con Postman.
5. Aplicar el uso de Github para el control de versiones.

## Funcionamiento del backend
A continuación mostraremos algunos resultados de algunas peticiones desarrolladas en el microservicio. Estos resultados están testeados con Postman, lo único que hacemos es indicar el tipo de petición (get, post, delete...) y la Url programada para cada una de ellas. Al enviar la petición Postman muestra el resultado devuelto por el microservicio.

## Peticion Get
En la primera imagen solicitamos que nos devuelva el contenido completo de la base de datos consultada. Por otro lado, podemoste indicar el "id" del artículo, y el microservicio nos devolverá la información unicamente de ese identificador si existe en la base de datos.

![Captura de pantalla 2024-10-16 a las 10 29 54](https://github.com/user-attachments/assets/b641ad1c-378a-4bb3-b1db-49b74938b15a)

## Petición Post
Esta petición lo que hace es crear un artículo nuevo con la información del "Body" que le pasemos. En este caso como el "id" es el identificador único de la tabla y se genera de forma automática no se indica en el "Body" del nuevo artículo, por lo que, no aseguramos de que no existen duplicados del mismo.

![Captura de pantalla 2024-10-16 a las 13 03 42](https://github.com/user-attachments/assets/d96f2d50-882b-48bb-95f6-261f5dd60a91)

## Peticion Delete y Push
La peticion delete, como se puede deducir, sería para poder eliminar un artículo de la base de datos, y la petición push, nos dejaría modificar algún campo del artículo indicado por el id. Para realizar la modificación debemos pasarle un "Body" completo incluido el "id" para que podemos buscarlo y modificarlo en la base de datos. EL video siguiente muestra un ejemplo de ambas peticiones incluso de la petición Get para mostrar que los cambios en la base de datos se realizan correctamente.

https://github.com/user-attachments/assets/ca0af267-1a15-49a8-afdd-b6a484a957ad
