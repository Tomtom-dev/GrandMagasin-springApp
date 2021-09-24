package com.example.grandmagasin.controllers;

import com.example.grandmagasin.models.Client;
import com.example.grandmagasin.models.Produit;
import com.example.grandmagasin.services.ClientService;
import com.example.grandmagasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("produit")
public class ProduitController {

    @Autowired
    private ProduitService service;

    @GetMapping("")
    public List<Produit> trouverTousCLient(){

        return this.service.TrouverTousClients();
    }

    @GetMapping("{id}")
    public Optional<Produit> findById(@PathVariable Long id){

        return this.service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){

        this.service.deleteById(id);
    }

    @PostMapping("")
    public void save (@RequestBody Produit entity){

        this.service.save(entity);
    }
}
