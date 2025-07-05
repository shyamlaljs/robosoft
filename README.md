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

🚀 Getting Started
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
2. Create the MySQL Database
sql
Copy
Edit
CREATE DATABASE springbootjdbc;
3. Build and Run the Application
bash
Copy
Edit
./mvnw spring-boot:run
📡 API Endpoints
Method	Endpoint	Description
GET	/students	Fetch all students
GET	/students/{id}	Get student by ID
POST	/students	Add a new student
PUT	/students/{id}	Update student by ID
DELETE	/students/{id}	Delete student by ID

🧾 Sample JSON Payload
POST /students
json
Copy
Edit
{
  "name": "Alice Johnson",
  "email": "alice@example.com",
  "course": "Computer Science"
}
PUT /students/{id}
json
Copy
Edit
{
  "name": "Alice Johnson",
  "email": "alice.j@example.com",
  "course": "AI & ML"
}
📁 Project Structure
bash
Copy
Edit
student-management-system/
│
├── src/main/java/com/example/student/
│   ├── controller/         # REST Controllers
│   ├── service/            # Business logic
│   ├── repository/         # JPA Repositories
│   ├── model/              # Student entity
│   └── SpringbootjdbcApplication.java
│
├── src/main/resources/
│   ├── application.properties
│
├── pom.xml
└── README.md
🔧 Dependencies (Maven)
Sample from pom.xml:

xml
Copy
Edit
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>

🤝 Contributing
Feel free to fork this repository and submit pull requests or issues. Contributions are welcome!



