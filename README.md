# crud-rest-api

# CRUD REST API using Spring Boot, JPA, and Oracle Database
This project is a simple example of a CRUD (Create, Read, Update, Delete) REST API built using Spring Boot, JPA (Java Persistence API), and Oracle Database.
Prerequisites

# Before running the application, make sure you have the following prerequisites installed:
•	Java Development Kit (JDK) version 8 or later
•	Maven build tool
•	Oracle Database with appropriate credentials
# Getting Started
# To get started with this project, follow these steps:
# 1.	Clone the repository:
git clone https://github.com/sKyi01/crud-rest-api
# 2.	Navigate to the project directory:
cd your-repo 
# 3.	Configure the Oracle database connection:
•	Open the src/main/resources/application.properties file.

•	Update the spring.datasource.url, spring.datasource.username, and spring.datasource.password properties with your Oracle database connection details.
# 4.	Build the project using Maven:
mvn clean install 
# 5.	Run the application:
mvn spring-boot:run 
# 6.	The API endpoints will be available at http://localhost:8080.
# API Endpoints
# The following API endpoints are available:
•	Create a new entity:
•	URL: POST /api/add
•	Request body: JSON payload containing entity data
•	Response: JSON representation of the created entity
•	Get all entities:
•	URL: GET /api/getAll
•	Response: JSON array containing all entities
•	Get an entity by ID:
•	URL: GET /api/get/{id}
•	Response: JSON representation of the requested entity
•	Update an existing entity:
•	URL: PUT /api/update/{id}
•	Request body: JSON payload containing updated entity data
•	Response: JSON representation of the updated entity
•	Delete an entity:
•	URL: DELETE /api/delete/{id}
•	Response: HTTP 204 No Content if successful
# Additional Configuration
# You can modify the project configuration based on your specific requirements. Some of the common configurations include:
•	Changing the server port: Open src/main/resources/application.properties and update the server.port property.
•	Adding additional fields to the entity: Open the corresponding entity class (Entity.java), add new fields, and update the necessary repositories, services, and controllers.
# Contributing
If you'd like to contribute to this project, you can follow these steps:
1.	Fork the repository on GitHub.
2.	Create a new branch for your changes.
3.	Make your modifications and commit your changes.
4.	Push your branch to your forked repository.
5.	Submit a pull request to the original repository.
# License
# This project is licensed under the MIT License.
# Contact
If you have any questions or feedback, please feel free to reach out to me at akashkhandagale038@gmail.com.

Happy coding!

