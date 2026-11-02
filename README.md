#  Hospital Management System with Spring AI

An AI-powered Hospital Management System built using **Java, Spring Boot, Spring Data JPA, MySQL, and Spring AI**. It provides patient management through REST APIs and an intelligent AI assistant that retrieves real patient records from the database using Spring AI Tool Calling.

##  Features

### Patient Management

* Create and manage patient records.
* Retrieve all patients or search by ID.
* Delete patient records.
* Persistent storage using MySQL and Spring Data JPA.

### AI Hospital Assistant

* Natural language interaction for patient queries.
* Spring AI Tool Calling for database retrieval.
* Real-time patient information lookup.
* AI-generated patient summaries.
* Database-grounded responses to minimize hallucinations.
* Clearly identifies patients who are not registered.

## 🛠️ Tech Stack

| Technology      | Purpose                       |
| --------------- | ----------------------------- |
| Java 21         | Programming Language          |
| Spring Boot 3   | Backend Framework             |
| Spring AI       | AI Integration & Tool Calling |
| Spring Data JPA | Database Operations           |
| Hibernate       | ORM                           |
| MySQL           | Database                      |
| Maven           | Build Tool                    |



##  REST API Endpoints

**Base URL:** `http://localhost:8080`

| Method | Endpoint         | Description            |
| ------ | ---------------- | ---------------------- |
| GET    | `/hospital`      | Retrieve all patients  |
| GET    | `/hospital/{id}` | Retrieve patient by ID |
| POST   | `/hospital`      | Register a new patient |
| DELETE | `/hospital/{id}` | Delete a patient       |

### Create Patient

`POST /hospital`

```json
{
  "patientName": "Priyank",
  "pAddress": "Indore",
  "age": 22,
  "gender": "Male",
  "disease": "Cold",
  "doctor": "Dr Sharma",
  "lastVisit": "2026-11-02"
}
```

## 🤖 AI Hospital Assistant

The AI assistant uses **Spring AI Tool Calling** to retrieve actual patient records through `FetchPatientTool`.

**Endpoint:**

```http
GET /ai?message=Show details of patient Priyank
```

**Sample Response:**

```text
Patient Summary

Name: Priyank
Age: 22
Gender: Male
Disease: Cold
Doctor: Dr Sharma
Last Visit: 2026-11-02
```

If a patient does not exist in the database, the assistant informs the user instead of generating fictional patient information.

## ⚙️ Configuration

Configure the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.ai.openai.api-key=${OPENAI_API_KEY}
```

Keep API keys and database credentials in environment variables rather than committing them to GitHub.

##  Getting Started

**1. Clone the repository**

```bash
git clone https://github.com/your-username/HospitalSystem-SpringAI.git
```

**2. Navigate to the project**

```bash
cd HospitalSystem-SpringAI
```

**3. Create the MySQL database**

```sql
CREATE DATABASE hospital_db;
```

**4. Configure database credentials and AI API key.**

**5. Build and run the application**

```bash
mvn clean install
mvn spring-boot:run
```

The application will start at `http://localhost:8080`.

## Project Objective

To demonstrate the integration of **Spring AI Tool Calling with a Spring Boot CRUD application**, enabling an AI assistant to interact with real-time database records and generate context-aware patient summaries.
