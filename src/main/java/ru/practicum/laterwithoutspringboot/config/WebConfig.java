package ru.practicum.laterwithoutspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc // импортирует дополнительную конфигурацию для веб-приложений
@PropertySource("classpath:application.properties")
public class WebConfig {
}
