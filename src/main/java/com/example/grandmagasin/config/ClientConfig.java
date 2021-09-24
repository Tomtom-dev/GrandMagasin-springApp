package com.example.grandmagasin.config;

import com.example.grandmagasin.repositories.ClientRepository;
import com.example.grandmagasin.services.ClientService;
import com.example.grandmagasin.services.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    public ClientService clientService (ClientRepository repo){
        return new ClientServiceImpl(repo);
    }
}
