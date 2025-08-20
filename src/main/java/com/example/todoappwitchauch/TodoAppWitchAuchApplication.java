package com.example.todoappwitchauch;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoAppWitchAuchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppWitchAuchApplication.class, args);
    }

    // Конфигурационный метод ВНЕ метода main, но внутри класса
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Todo App API")
                        .version("1.0")
                        .description("Документация для Todo приложения"));
    }
}