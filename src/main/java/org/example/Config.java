package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public Library library(Book book) {
        Library library = new Library();
        library.setBook(book);
        return library;
    }
}
