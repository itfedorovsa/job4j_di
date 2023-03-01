package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstration of a Spring Context class
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 01.03.23
 */
public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store1 = context.getBean(Store.class);
        store1.add("John Smith");
        Store store2 = context.getBean(Store.class);
        store2.getAll().forEach(System.out::println);
    }

}