# 🎓 Student Management System

A simple and extensible **Student Management System** built using **Spring Boot**, **Spring Data JPA**, and **JDBC**. This application connects to a MySQL database and allows for basic student record operations like **Create, Read, Update, and Delete (CRUD)** via a RESTful API.

---

## 📌 Features

- Add new student records
- Update student details
- Delete student entries by ID
- Fetch all students or a specific one by ID
- Connects to MySQL using JDBC
- JPA-based ORM for entity persistence
- RESTful API built using Spring Web

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring JDBC
- MySQL
- Hibernate (via JPA)
- Maven
- Lombok (optional)
- Spring Web (REST API)

---

## ⚙️ Configuration

### Database Settings

Your configuration file: `src/main/resources/application.properties`

```properties
spring.application.name=springbootjdbc
spring.datasource.url=jdbc:mysql://localhost:3306/springbootjdbc
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
