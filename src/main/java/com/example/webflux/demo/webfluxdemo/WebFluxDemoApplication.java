package com.example.webflux.demo.webfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class WebFluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxDemoApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes() {
		return RouterFunctions.route(RequestPredicates.GET("/")
				, req -> ServerResponse.ok().body(Flux.just("Hello", "World!"), String.class));
	}
}
