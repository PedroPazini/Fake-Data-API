# Fake Data API
A simple Spring Boot API that generates and serves large amounts of fake data for testing and simulation purposes.

This project was created to fill a gap: the need for a reliable API that returns fake data to simulate responses from external APIs during development and testing. It uses the [Faker](https://github.com/DiUS/java-faker) library to generate realistic user information and is designed to be easily extended for other types of data in the future.

## Features
- Generates large datasets of fake users (names, addresses, emails) for testing.
- Two modes for user generation:
    - **Repeated Data**: Returns a fixed list of 10,000 users by default (same data every time; configurable).
    - **Dynamic Data**: Generates a new list of users on each request (up to 100,000 by default, configurable).
- Easily extendable to simulate other entities (products, addresses, orders, etc.) using the Faker library.
- Lightweight and fast, ideal for testing APIs or front-end applications without hitting real external services.

## Getting Started
### Prerequisites
- Java 17+
- Maven 3.9.9
- Spring Boot

### Running the Project
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/fake-data-api.git
    cd fake-data-api
   ```
2. Build and run the project:
    ```bash
    ./mvnw spring-boot:run
   ```
3. The API will be available at http://localhost:8081.

## API Endpoints
### Users
| Method | Endpoint                     | Description                                               |
|--------|------------------------------|-----------------------------------------------------------|
| GET    | `/api/v1/users/fake/all/same` | Returns a fixed list of 10,000 fake users. (configurable) |
| GET    | `/api/v1/users/fake/all/new`  | Generates a new list of 100,000 fake users. (configurable)            |

## Project Structure
| Class / Package           | Description                                                      |
|---------------------------|------------------------------------------------------------------|
| `DataApplication`         | Spring Boot main application class.                              |
| `UserController`          | REST controller exposing endpoints for fake user data.           |
| `UserService / UserServiceImpl` | Service layer that handles user generation logic.          |
| `UserDto`                 | Data Transfer Object representing a user.                        |
| `RestResponse`            | Generic response wrapper for API responses.                      |

## Technologies
- Spring Boot – REST API framework
- Java 17
- Faker – Fake data generation library
- Maven 3.9.9 – Build and dependency management
- Tomcat - Embedded server for WAR packaging.

## Motivation
During development, I needed a source of realistic fake data to simulate API responses. I could not find a convenient API online that allowed generating large datasets with customizable content.

This project was created to:
- Simulate external API responses.
- Provide realistic test data for development.
- Be easily extendable for other data types in the future.

## Future Improvements
- Add endpoints for other types of data (products, addresses, orders, etc.).
- Add query parameters to filter and customize generated data.
- Add pagination for very large datasets.
- Integrate with Swagger/OpenAPI for interactive documentation.

## Usage
This API is perfect for:

- Frontend developers needing realistic data to test UI components.
- Backend developers simulating responses from third-party APIs.
- Testing and development environments where real data cannot or should not be used.

## Third-Party Libraries
This project uses [Faker](https://github.com/DiUS/java-faker) (MIT License) for generating fake data.

## License
MIT License