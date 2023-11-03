package com.solaceBinders.messaging;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Component
public class SolaceBroker {
    Integer count = 1;
    Integer count2 = 1;

    @Bean
    public Consumer<String> uppercase(){
        return s -> System.out.println("Solace Consumer :: " + count++ + " :: " + s.toUpperCase());
    }

    @Bean
    public Supplier<String> supplier() {
        return () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer :: Supplier :: " + count2++);
            return "Test Supplier";
        };
    }

    @Bean
    public Supplier<String> lowercase() {
        return () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer :: Lowercase :: " + count2++);
            return "Test lowercase";
        };
    }
}
