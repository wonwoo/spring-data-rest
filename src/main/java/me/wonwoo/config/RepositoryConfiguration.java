package me.wonwoo.config;

import me.wonwoo.event.AccountEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 16. 1. 19..
 */
@Configuration
public class RepositoryConfiguration {

    @Bean
    public AccountEventHandler accountEventHandler(){
        return new AccountEventHandler();
    }

}
