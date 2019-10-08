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

## References
- [Countries API](https://rapidapi.com/apilayernet/api/rest-countries-v1?endpoint=53aa5a08e4b0a705fcc323a6)
- [Joke API](https://rapidapi.com/LemmoTresto/api/joke3?endpoint=apiendpoint_c198a2fb-fc88-4a86-9e34-e2978fc1a7c2)
- [Spring Guide](https://spring.io/guides/gs/gateway/)
- [Spring Cloud Gateway Documentation](https://cloud.spring.io/spring-cloud-gateway/reference/html/#gateway-how-it-works)
