# 🎓 Student Management System - Backend

Spring Boot REST API backend for Student Management System with authentication and student CRUD operations.

🔗 Frontend Repository
https://github.com/shraddhamane6109/student-management-frontend

---

# 🚀 Features

## 🔐 Authentication

* User Register API
* User Login API

## 👨‍🎓 Student Management

* Add Student
* Get All Students
* Update Student
* Delete Student
* Full CRUD Operations

## 🔒 Security

* Spring Security (Basic)
* CORS Configuration
* REST API Protection

---

# 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Spring Security
* MySQL
* Maven

---

# 📁 Project Structure

```
src
 ├── controller
 ├── entity
 ├── repository
 ├── service
 ├── config
 └── StudentManagementApplication.java
```

---

# 🔗 API Endpoints

## Authentication APIs

### Register User

```
POST /auth/register
```

### Login User

```
POST /auth/login
```

---

## Student APIs

### Get All Students

```
GET /students
```

### Add Student

```
POST /students
```

### Update Student

```
PUT /students/{id}
```

### Delete Student

```
DELETE /students/{id}
```

---

# 🗄️ Database Configuration

Update `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ How to Run

## 1. Clone Repository

```
git clone https://github.com/shraddhamane6109/student-management-backend.git
```

## 2. Open in Eclipse

Import project as **Maven Project**

## 3. Create MySQL Database

```
CREATE DATABASE studentdb;
```

## 4. Run Spring Boot Application

Run:

```
StudentManagementApplication.java
```

Server starts at:

```
http://localhost:8080
```

---

# 🧪 Test APIs

You can test APIs using:

* Postman
* Thunder Client
* Browser (GET APIs)

---

# 🔮 Future Improvements

* JWT Authentication
* Role Based Access (Admin/User)
* Request Validation
* Global Exception Handling
* Pagination & Sorting
* Docker Deployment

---

# 👩‍💻 Author

Shraddha Mane
MCA Student (2027)
Full Stack Developer
React | Java | Spring Boot | MySQL
