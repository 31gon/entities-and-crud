# entities-and-crud

Spring Boot learning repo — Entities and CRUD REST API.

## Stack
Java, Spring Boot, Spring Data JPA, H2 (file-based), Gradle (Kotlin DSL)

## Concepts learned
- JPA entity mapping (`@Entity`, `@Id`, `@GeneratedValue`, `@PrePersist`)
- Repository layer via `JpaRepository` (derived query methods)
- Service layer separating business logic from HTTP (web) layer
- REST controller with full CRUD (`GET`, `POST`, `PUT`, `DELETE`)
- Bean validation (`@Valid`, `@NotBlank`)
- Centralized exception handling (`@RestControllerAdvice`, custom exceptions)
- DTO pattern (request/response separation from entity)

## Endpoints
| Method | Path | Description |
|---|---|---|
| GET | /tasks | List all tasks |
| GET | /tasks/{id} | Get task by id |
| POST | /tasks | Create task |
| PUT | /tasks/{id} | Update task |
| DELETE | /tasks/{id} | Delete task |

## Run locally
./gradlew bootRun
