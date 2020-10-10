package org.hse.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.function.Supplier;

/**
 *
 *
 */

@Configuration
public class AppConfig {
    @Bean("mealTicketCounter")
    @Primary
    @Autowired
    public Supplier<Long> getTicketCounter(Qualifier ){
        return new MealTicketCounter();
    }

}
