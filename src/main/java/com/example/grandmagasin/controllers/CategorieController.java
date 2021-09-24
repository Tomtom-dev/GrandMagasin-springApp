package com.example.grandmagasin.controllers;

import com.example.grandmagasin.models.Categorie;
import com.example.grandmagasin.models.Produit;
import com.example.grandmagasin.services.CategorieService;
import com.example.grandmagasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("categorie")
public class CategorieController {

    @Autowired
    private CategorieService service;

    @GetMapping("")
    public List<Categorie> trouverTousCLient(){
        return this.service.TrouverToutesCategories();
    }

    @GetMapping("{id}")
    public Optional<Categorie> findById(@PathVariable Long id){
        return this.service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){

        this.service.deleteById(id);
    }

    @PostMapping("")
    public void save (@RequestBody Categorie entity){
        this.service.save(entity);
    }
}
