# Account Service - Security Assignment

> This is a security assignment for the Hyperskill course [Account Service](https://hyperskill.org/courses/2022-2023-courses/account-service).
> This solution is one of many ways of solving the assignment.

## Getting started

You can get started by cloning this repository and installing the dependencies:
- Java SE 17

## Layers and packaging

We are separating the code into layers.
The layers are:
- `api`: The API layer contains all endpoint information. This is responsible for handling the incoming requests and returning the appropriate responses.
- `usecases`: The use case layer contains all the business processes' logic. This is responsible for using the domain layer in a correct way.
- `domain`: The domain layer contains all the inherent business logic.
- `repository`: The repository layer contains all the database interactions.

The use cases package also contains all DTOs and Commands.
The domain package also contains all Value objects.

### DTO - Data Transfer Object

A DTO is a data transfer object. It is used to transfer data out of the use case layer to the api layer. It encapsulates the domain and only provides public answers to the UI.

### Command

A command is a request to change the state of the domain. It is used to transfer data from the api layer to the use case layer.

### Value Object

A value object is an object that represents a simple value that is immutable and repeatedly used in the domain.
It is used to encapsulate the domain logic and provide a clear interface for the domain.

## Regex Patterns

We are using a couple of regular expressions in our code.
These regex patters are tested via the [Online Regex parser: Regexr](https://regexr.com/).

- Email: [Email regex](https://regexr.com/89rs5)