package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {

            Library library = context.getBean(Library.class);
            library.printLibraryInfo();
        }
    }
}
