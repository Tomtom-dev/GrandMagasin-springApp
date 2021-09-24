package com.example.grandmagasin.controllers;

import com.example.grandmagasin.models.Client;
import com.example.grandmagasin.models.Commande;
import com.example.grandmagasin.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("commande")
public class CommandeController {

    @Autowired
    private CommandeService service;

    @GetMapping("")
    public List<Commande> TrouverToutesCommandes(){
        return this.service.TrouverToutesCommandes();
    }

    @GetMapping("{id}")
    public Optional<Commande> findById(@PathVariable Long id){
        return this.service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){

        this.service.deleteById(id);
    }

    @PostMapping("")
    public void save (@RequestBody Commande entity){

        this.service.save(entity);
    }

}
