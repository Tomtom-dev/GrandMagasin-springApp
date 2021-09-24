package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Categorie;
import com.example.grandmagasin.repositories.CategorieRepository;

import java.util.List;
import java.util.Optional;

public class CategoriesServiceImpl implements CategorieService{

    private CategorieRepository repository;

    public CategoriesServiceImpl (CategorieRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Categorie> TrouverToutesCategories() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Categorie> findById(Long aLong) {
        return this.repository.findById(aLong);
    }

    @Override
    public void deleteById(long aLong) {
        this.repository.deleteById(aLong);
    }

    @Override
    public Categorie save(Categorie entity) {
        return this.repository.save(entity);
    }
}
