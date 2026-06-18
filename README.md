# Food Ordering System

A Spring Boot project created as part of the Java Development training programme.
This project demonstrates environment setup, database connectivity, and project structure
using Spring Boot, Maven, and MySQL.

---

## Technologies Used

- Java 21
- Spring Boot 3.x
- Maven
- MySQL
- Spring Data JPA
- Lombok
- DBeaver (Database Client)
- IntelliJ IDEA

---

## Part 4: Research Questions

### 1. What is Spring Boot?
Spring Boot is a Java-based framework that simplifies the process of building
web applications and REST APIs. Instead of writing a lot of configuration code
manually, Spring Boot automatically configures most things for you, allowing
developers to focus on writing business logic rather than setup.

### 2. What is Maven?
Maven is a build and project management tool used in Java projects. It handles
compiling your code, running tests, and packaging your application. It also
manages all the external libraries your project needs by downloading them
automatically from the internet.

### 3. What is the purpose of pom.xml?
The pom.xml (Project Object Model) is the configuration file that Maven reads
to understand your project. It contains the project details, the Java version
being used, and a list of all dependencies (libraries) the project needs.
When you add a dependency here, Maven automatically downloads and includes it.

### 4. What is the purpose of application.properties?
application.properties is a configuration file in Spring Boot where you define
settings for your application such as the database URL, username, password,
server port, and other environment-specific values. It allows you to change
how your application behaves without modifying the actual code.

### 5. What does @SpringBootApplication do?
@SpringBootApplication is an annotation placed on the main class of a Spring
Boot application. It combines three things in one:
- It enables automatic configuration of Spring components
- It enables component scanning so Spring can find all your classes
- It marks the class as a configuration source
  When you run the application, Spring Boot starts from this class.

### 6. Why do developers use dependency management tools such as Maven?
Without a tool like Maven, developers would have to manually download every
library their project needs, manage different versions, and handle conflicts
between libraries. Maven automates all of this. It downloads the correct
versions, ensures compatibility, and makes it easy for any developer to
clone a project and run it without manually setting anything up.

### 7. What is a REST API?
A REST API (Representational State Transfer Application Programming Interface)
is a way for different applications to communicate with each other over the
internet using HTTP. It uses standard methods like GET (retrieve data),
POST (send data), PUT (update data), and DELETE (remove data). For example,
when a food ordering app loads your menu, it is calling a REST API to fetch
that data from the server.

### 8. What is JSON?
JSON (JavaScript Object Notation) is a lightweight format used to send and
receive data between a server and a client. It is easy for humans to read
and write, and easy for machines to process. Most REST APIs send and receive
data in JSON format.

Example:
{
"id": 1,
"name": "Fast Food"
}

### 9. What is Dependency Injection?
Dependency Injection is a design pattern where an object receives the things
it needs (its dependencies) from an external source rather than creating them
itself. In Spring Boot, instead of a class creating its own database connection
or service object, Spring automatically provides (injects) those objects. This
makes code easier to test, maintain, and change.

---

## Part 5: Package Structure

| Package | Purpose |
|---------|---------|
| `controller` | Handles incoming HTTP requests from the client and returns responses. This is the entry point of the application. |
| `service` | Contains the business logic of the application. The controller calls the service to process requests. |
| `repository` | Responsible for communicating with the database. Uses Spring Data JPA to run queries. |
| `entity` | Contains Java classes that map directly to database tables. Each field in the class represents a column. |
| `dto` | Data Transfer Objects are used to shape the data that moves between layers, keeping the entity separate from what the client sees. |
| `config` | Holds configuration classes for the application such as security settings, CORS configuration, or custom beans. |
| `exception` | Contains custom exception classes and a global error handler to manage errors consistently across the application. |

---

## Part 3: Database Setup

Database: `food_ordering_db`

Table: `category`

| id | name |
|----|------|
| 1 | Fast Food |
| 2 | Pizza |
| 3 | Drinks |
| 4 | Desserts |

SQL used:

```sql
CREATE DATABASE food_ordering_db;

USE food_ordering_db;

CREATE TABLE category (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);

INSERT INTO category (name) VALUES
('Fast Food'),
('Pizza'),
('Drinks'),
('Desserts');
```

---

## Screenshots

Screenshots are available in the `/screenshots` folder showing:
- Java installation verification
- Git installation verification
- DBeaver database connection
- Database and table creation
- Data inserted and verified
- Project structure in IntelliJ

---

## GitHub

Repository: food-ordering-system  
Trainer Collaborator: vhutuzahcharles@gmail.com
## Database Configuration Complete