# Spring Cloud Gateway Example with Hystrix

This example project covers the usage of Spring Cloud Gateway along with Hystrix for circuit breaker functionality

## Dependencies Used
- Spring Boot 2.1.9
- Spring Cloud Gateway
- Spring Cloud Netflix Hystrix
- Spring Cloud Netflix Hystrix Dashboard

## Architecture
![Architecture](./architecture.png)

## URLs
- `http://localhost:8080/all` - Countries Service
- `http://localhost:8080/v1/joke` - Joke Service
- `http://localhost:8080/actuator/hystrix.stream` - Hystrix Stream endpoint
- `http://localhost:8081/hystrix` - Hystrix Dashboard
