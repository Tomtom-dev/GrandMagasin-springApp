package com.example.grandmagasin.config;

import com.example.grandmagasin.repositories.ClientRepository;
import com.example.grandmagasin.repositories.CommandeRepository;
import com.example.grandmagasin.services.ClientService;
import com.example.grandmagasin.services.ClientServiceImpl;
import com.example.grandmagasin.services.CommandeService;
import com.example.grandmagasin.services.CommandeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    public ClientService clientService (ClientRepository repo){

        return new ClientServiceImpl(repo);
    }

    @Bean
    public CommandeService commandeService(CommandeRepository repo){
        return new CommandeServiceImpl(repo);
    }
}
