package com.github.ericNKS.desafio_btg_backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "BTG Challenge API",
                version = "1.0.0",
                description = "REST API for processing transactions with MongoDB and RabbitMQ.",
                contact = @Contact(
                        name = "Backend Team",
                        email = "ek.silva.santos@gmail.com"
                )
        ),
        servers = {
                @Server(
                        url = "http://localhost:3000",
                        description = "Local development server"
                )
        }
)
public class OpenApiConfig {
}