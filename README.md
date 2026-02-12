# 📌 Student Management System

A Spring Boot REST API project for managing student records using MySQL database.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (for API testing)

---

## 📂 Features

- Add new student
- Get all students
- Get student by ID
- Update student
- Delete student

---

## 📌 API Endpoints

### ➤ Add Student
POST  http://localhost:8080/students

### ➤ Get All Students
GET  http://localhost:8080/students

### ➤ Get Student By ID
GET  http://localhost:8080/students/{1}

### ➤ Update Student
PUT  http://localhost:8080/students/{2}

### ➤ Delete Student
DELETE  http://localhost:8080/students/{1}

---

## 🗄 Database Configuration

Update `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db  
spring.datasource.username=your_username  
spring.datasource.password=your_password  
spring.jpa.hibernate.ddl-auto=update  

---

## ▶️ How To Run The Project

1. Clone the repository  
2. Open in IntelliJ IDEA  
3. Create database `student_db` in MySQL  
4. Update username & password in application.properties  
5. Run StudentManagementApplication  
6. Test APIs using Postman  

---

## 📌 Project Description

This project demonstrates practical implementation of RESTful APIs 
using Spring Boot with database integration through JPA & Hibernate.

---

## 👨‍💻 Author

Mohd Rashid
