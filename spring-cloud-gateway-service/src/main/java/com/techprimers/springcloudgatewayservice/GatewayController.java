package com.techprimers.springcloudgatewayservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GatewayController {

    @RequestMapping("/countriesfallback")
    public Mono<String> countries() {
        return Mono.just("Countries API is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/jokefallback")
    public Mono<String> joke() {
        return Mono.just("Joke API is taking too long to respond or is down. Please try again later");
    }
}
