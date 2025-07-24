# LiterAlura Challenge

Este proyecto es una aplicación desarrollada en **Java** utilizando el framework **Spring Boot** y gestionada con **Maven**. 

La aplicación consume la API pública de [Gutendex](https://gutendex.com/) para obtener datos de libros y autores, que luego se transforman en objetos del modelo para su manipulación y almacenamiento en una base de datos local. Esto permite a los usuarios realizar búsquedas de libros y autores, así como obtener estadísticas basadas en la información almacenada.

---

## Tecnologías utilizadas

- Java 17 (o la versión que uses)
- Spring Boot
- Maven
- Base de datos relacional (indica cuál usas: H2, MySQL, PostgreSQL, etc.)
- Gutendex API (consumo externo de datos)

---

## Estructura del proyecto

El proyecto sigue la estructura estándar de Maven con paquetes organizados en:

- **modelos:** Clases que representan entidades como libros y autores.
- **repositorios:** Interfaces para acceso a la base de datos.
- **servicios:** Lógica de negocio para manejar datos y comunicación con la API externa.

---

## Instalación y ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/JoseI11/LiterAlura-challenge.git
```
2. Entrar a la carpeta del proyecto:

```bash

cd LiterAlura-challenge
```
3. Construir el proyecto y descargar dependencias con Maven:
```bash
mvn clean install
```
4. Ejecutar la aplicación:

```bash

mvn spring-boot:run
```

## Funcionalidades principales
Consumo de la API Gutendex para obtener datos de libros y autores.

Almacenamiento de datos en la base de datos local.

Búsqueda de libros y autores mediante diferentes filtros.

Obtención de estadísticas relacionadas con los datos almacenados.

## Contribuciones
¡Las contribuciones son bienvenidas! Para colaborar:

Haz un fork del proyecto.

Crea una rama con tu feature: git checkout -b feature/nueva-funcionalidad

Haz commit de tus cambios: git commit -m 'Agrega nueva funcionalidad'

Haz push a la rama: git push origin feature/nueva-funcionalidad

Abre un Pull Request.

## Autor
José Imhoff – GitHub

