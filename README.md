# 🎓 Student CRUD API

A clean, minimal REST API for managing student records, built with **Spring Boot 4**, **Java 21**, **Spring Data JPA** and an in-memory **H2** database. There is nothing to install: clone it and run it.

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0-6DB33F?logo=springboot&logoColor=white)
![H2](https://img.shields.io/badge/H2-in--memory-1F6FEB)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white)

## ✨ Features

- Full **Create / Read / Update / Delete** for students
- Layered design: `StudentController` → `StudentService` → `StudentRepository`
- **Lombok** to cut out getters, setters and constructors
- **H2 console** to inspect the database in the browser
- SQL logging turned on so you can see what Hibernate runs

## 📦 Data model

| Field | Type | Notes |
|---|---|---|
| `id` | `Long` | Auto-generated |
| `name` | `String` | |
| `email` | `String` | |
| `course` | `String` | |

## 🔌 API endpoints

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/students` | Create a student |
| `GET` | `/students` | List all students |
| `GET` | `/students/{id}` | Get a student by id |
| `PUT` | `/students/{id}` | Update a student |
| `DELETE` | `/students/{id}` | Delete a student |

## 🚀 Getting started

**Prerequisite:** Java 21

```bash
git clone https://github.com/AnjanRimal/student-crud-api.git
cd student-crud-api
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

The API runs on **http://localhost:8080**.

### H2 console
Open **http://localhost:8080/h2-console** and connect with:
- JDBC URL: `jdbc:h2:mem:studentdb`
- User: `sa` · Password: *(empty)*

> Data lives in memory, so it resets every time the app restarts.

## 🧪 Try it

```bash
# Create
curl -X POST localhost:8080/students -H "Content-Type: application/json" \
  -d '{"name":"Anjan Rimal","email":"anjan@example.com","course":"Computer Science"}'

# Read all / one
curl localhost:8080/students
curl localhost:8080/students/1

# Update
curl -X PUT localhost:8080/students/1 -H "Content-Type: application/json" \
  -d '{"name":"Anjan Rimal","email":"anjan@example.com","course":"Software Engineering"}'

# Delete
curl -X DELETE localhost:8080/students/1
```

## 🛣️ Roadmap
- [ ] Input validation (`@NotBlank`, `@Email`) with clear error responses
- [ ] Return `404 Not Found` for missing students and `201 Created` on create
- [ ] OpenAPI / Swagger UI
- [ ] Tests with `@WebMvcTest` and `@DataJpaTest`
- [ ] Switch to PostgreSQL with Spring profiles

## 👤 Author
**Anjan Rimal** · [Portfolio](https://anjanrimal.com/) · [LinkedIn](https://www.linkedin.com/in/anjanrimal) · [GitHub](https://github.com/AnjanRimal)
