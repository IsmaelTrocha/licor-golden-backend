# Project Name

Welcome this section is documentation of the API developed with Spring and Java back-end technologies. This API follows the hexagonal architecture and has been developed following Test Driven Development (TDD) practices, making use of patterns such as DTO (Data Transfer Object) and employing the Builder design pattern.

## Project Summary

The project uses Spring Boot for back-end development and Java as the main language. Hexagonal architecture, also known as port and adapter architecture, has been followed to facilitate separation of concerns and promote clean and maintainable code.

## Technologies Used

<details>
<summary><b>Spring Boot</b></summary>

Spring Boot is a framework for building Java-based enterprise applications. It simplifies the process of building production-ready applications and provides a convention-over-configuration approach.

<details>
<summary><b>Dependencies</b></summary>

- **Spring Boot Starter Web:** Used for building web applications, including RESTful applications using Spring MVC.
- **Spring Boot Starter Data JPA:** Provides support for the Java Persistence API (JPA) for data access.
- **Spring Boot Starter Test:** Includes testing libraries like JUnit and Mockito for unit testing.

</details>

</details>
<details>
<summary><b>JUnit y Mockito</b></summary>
  Used to perform unit tests and follow TDD methodology.
</details>

## Project Structure

The project structure follows the hexagonal architecture, dividing responsibilities into layers:

- Domain: Contains the business logic and domain entities.
- Application: Implements use cases and orchestrates the business logic.
- Adapters: Contains adapters for the user interface, databases and other external services.
- Infrastructure: It contains concrete implementations and technical details, such as data persistence and external services.

## Layers Coverage -> 100%

![image](https://github.com/IsmaelTrocha/Evolution-Code/assets/114845174/40cf5bc1-fe9d-4504-b576-2acb9d08b7ba)

