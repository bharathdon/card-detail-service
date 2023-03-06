package com.keybank.carddetailservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Component;

@OpenAPIDefinition(info = @Info(title = "card detail service application",description = "sample project",version = "1.0",
        license = @License(
                name = "MIT Licence",
                url = "https://github.com/thombergs/code-examples/blob/master/LICENSE")),
        servers = @Server(url = "http://localhost:9000"))
@Component
public class CardDetailsSwaggerConfiguration {
}
