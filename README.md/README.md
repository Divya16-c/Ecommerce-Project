# 🛒 Cloud-Based E-Commerce Order Management System

A full-stack E-Commerce Order Management System built using **Spring Boot**, **React.js**, and **MySQL**. The application provides REST APIs for managing products and customer orders, with a React frontend for user interaction. The backend can be deployed on **AWS Elastic Beanstalk**, and the database can be hosted on **Amazon RDS**.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![React](https://img.shields.io/badge/React-18-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![AWS](https://img.shields.io/badge/AWS-Elastic%20Beanstalk-yellow)

---

# 📌 Overview

This project is a cloud-based E-Commerce Order Management System that allows users to manage products and place customer orders.

The backend is developed using Spring Boot REST APIs, while the frontend is built using React.js. Product and order information is stored in a MySQL database.

The application demonstrates CRUD operations, REST API development, database connectivity, and cloud deployment.

---

# 🏗️ System Architecture

```
                 React Frontend
                       │
                       ▼
          Spring Boot REST API
                       │
                       ▼
                MySQL Database
```

If deployed on AWS:

```
Client (Browser)
      │
      ▼
AWS Elastic Beanstalk
(Spring Boot Backend)
      │
      ▼
Amazon RDS (MySQL)
```

---

# ✨ Features

- View all available products
- Add new products
- Place customer orders
- View all orders
- REST API Integration
- MySQL Database Connectivity
- Responsive React User Interface
- Cloud Deployment Ready

---

# 🛠️ Technology Stack

## Frontend

- React.js
- HTML5
- CSS3
- JavaScript
- Axios

## Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Maven

## Database

- MySQL

## Tools

- VS Code
- IntelliJ IDEA
- Git
- GitHub
- Postman
- MySQL Workbench

## Cloud

- AWS Elastic Beanstalk (Optional)
- Amazon RDS (Optional)

---

# 📂 Project Structure

```
Ecommerce-Project
│
├── README.md
│
├── ecommerce
│   ├── src
│   ├── pom.xml
│   └── ...
│
├── react_ecommerce_frontend
│   ├── src
│   ├── public
│   ├── package.json
│   └── ...
```

---

# 📊 Database Schema

## Product Table

| Column | Type | Description |
|----------|----------|----------------|
| id | INT | Product ID |
| name | VARCHAR | Product Name |
| price | DECIMAL | Product Price |
| quantity | INT | Available Stock |

---

## Orders Table

| Column | Type | Description |
|----------|----------|----------------|
| id | INT | Order ID |
| customer_name | VARCHAR | Customer Name |
| product_name | VARCHAR | Product Name |
| quantity | INT | Ordered Quantity |

---

# 🔌 REST API Endpoints

## Product APIs

| Method | Endpoint | Description |
|----------|-----------|----------------|
| GET | /products | Get all products |
| POST | /products | Add new product |

---

## Order APIs

| Method | Endpoint | Description |
|----------|-----------|----------------|
| GET | /orders | Get all orders |
| POST | /orders | Place new order |

---

# 📥 Sample API Response

## GET /products

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 65000,
    "quantity": 5
  },
  {
    "id": 2,
    "name": "Headphones",
    "price": 5000,
    "quantity": 10
  }
]
```

---

## POST /orders

### Request

```json
{
  "customerName":"Divya",
  "productName":"Laptop",
  "quantity":1
}
```

### Response

```json
{
  "id":1,
  "customerName":"Divya",
  "productName":"Laptop",
  "quantity":1
}
```

---

# 🚀 Local Setup

## Prerequisites

- Java 21
- Maven
- Node.js
- npm
- MySQL
- Git

---

## Clone Repository

```bash
git clone https://github.com/Divya16-c/Ecommerce-Project.git
```

```bash
cd Ecommerce-Project
```

---

## Backend Setup

Go to backend folder

```bash
cd ecommerce
```

Configure MySQL in

```
src/main/resources/application.properties
```

Example

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Run backend

```bash
mvn spring-boot:run
```

Backend URL

```
http://localhost:8080
```

---

## Frontend Setup

Go to frontend folder

```bash
cd react_ecommerce_frontend
```

Install packages

```bash
npm install
```

Run frontend

```bash
npm start
```

Frontend URL

```
http://localhost:3000
```

---

# ☁️ AWS Deployment (Optional)

Deploy the Spring Boot application using AWS Elastic Beanstalk.

Steps:

1. Package project

```bash
mvn clean package
```

2. Create Elastic Beanstalk Application

3. Upload generated JAR

4. Connect Amazon RDS MySQL Database

5. Deploy

---

# 🧪 Testing

The project was tested using:

- Postman
- Browser
- MySQL Workbench

Verified APIs:

- GET /products
- POST /products
- GET /orders
- POST /orders

---

# 📸 Screenshots

Add screenshots here.

Example

```
screenshots/
│
├── Home.png
├── ProductList.png
├── AddProduct.png
├── Orders.png
```

Example Markdown

```markdown
## Home Page

![Home](screenshots/Home.png)

## Product List

![Products](screenshots/ProductList.png)

## Orders

![Orders](screenshots/Orders.png)
```

---

# 🔮 Future Enhancements

- User Login & Registration
- JWT Authentication
- Shopping Cart
- Payment Gateway
- Product Search
- Wishlist
- Admin Dashboard
- Order Tracking
- Email Notifications
- Inventory Management

---

# 👩‍💻 Author

**Divya C Gowda**

B.E. Computer Science and Engineering

Gopalan College of Engineering and Management

GitHub

https://github.com/Divya16-c

Repository

https://github.com/Divya16-c/Ecommerce-Project

---

# ⭐ If you like this project

Please give this repository a ⭐ on GitHub.

---

# 📄 License

This project is developed for educational purposes and learning. Feel free to use and modify it for academic projects.