# Student Management System - Backend

Spring Boot backend for Student Management System with authentication and CRUD operations.

## Features

### Authentication
- User Register API
- User Login API

### Student Management
- Add Student
- Get All Students
- Update Student
- Delete Student

### Security
- Spring Security (basic)
- CORS enabled

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Maven

---

## Project Structure

```
src
 ├── controller
 ├── entity
 ├── repository
 ├── config
 └── StudentManagementApplication.java
```

---

## API Endpoints

### Authentication

Register User
```
POST /auth/register
```

Login User
```
POST /auth/login
```

---

### Student APIs

Get All Students
```
GET /students
```

Add Student
```
POST /students
```

Update Student
```
PUT /students/{id}
```

Delete Student
```
DELETE /students/{id}
```

---

## Database Configuration

Update `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## How to Run

### 1. Clone project

```
git clone your-repo-link
```

### 2. Open in Eclipse

Import as Maven Project

### 3. Create MySQL Database

```
CREATE DATABASE studentdb;
```

### 4. Run Spring Boot

Run:

```
StudentManagementApplication.java
```

Server runs at:

```
http://localhost:8080
```

---

## Author

Shraddha Mane

---

## Future Improvements

- JWT Authentication
- Role Based Access
- Validation
- Exception Handling
- Pagination
- Deployment
