package com.example.grandmagasin.controllers;

import com.example.grandmagasin.models.Client;
import com.example.grandmagasin.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("")
    public List<Client> trouverTousCLient(){
        return this.service.TrouverTousClients();
    }

    @GetMapping("{id}")
    public Optional<Client> findById(@PathVariable Long id){
        return this.service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
         this.service.deleteById(id);
    }

    @PostMapping("")
    public void save (@RequestBody Client entity){
         this.service.save(entity);
    }
}
