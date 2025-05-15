# ExhaustInventoryManager

ExhaustInventoryManager is a full-stack Java web application for managing performance exhaust parts and kits. Built with Spring Boot and Thymeleaf, it supports inventory tracking, CRUD operations, and dynamic product configuration for automotive performance applications.

---

## 🚗 Features

- Add, edit, and delete **in-house** and **outsourced** exhaust parts
- Create and manage **exhaust kits (products)** composed of multiple parts
- Track inventory with **min/max stock rules** and validations
- Associate/disassociate parts with products
- Real-time user feedback through **confirmation pages and error handling**
- Responsive UI built with **Bootstrap 5**
- Lightweight **H2 in-memory database** for easy dev/testing
- Modular MVC design with **Spring Boot, Thymeleaf, and JPA**

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 2.6.6
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- Maven
- H2 Database (file-based dev mode)

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+

### Installation

git clone https://github.com/GrahamC7/ExhaustInventoryManager.git
cd ExhaustInventoryManager
mvn clean install
mvn spring-boot:run

---

### Open in browser:
http://localhost:8080

### Optional: H2 Console
Navigate to:
http://localhost:8080/h2-console
Use JDBC URL: jdbc:h2:file:~/performance-exhaust-parts-db

---

## 📂 Project Structure
src/
├── main/
│   ├── java/com/graham/exhaust/
│   └── resources/
│       ├── templates/
│       └── static/
└── test/

---

## 📃 License
This project is licensed under the MIT License.

Made with horsepower and coffee by Graham Cockerham

---
