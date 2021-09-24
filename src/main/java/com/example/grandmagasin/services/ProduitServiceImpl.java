package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Produit;
import com.example.grandmagasin.repositories.ProduitRepository;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements ProduitService{

    private ProduitRepository repository;

    public ProduitServiceImpl(ProduitRepository repository){
    this.repository=repository;
    }

    @Override
    public List<Produit> TrouverTousClients() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Produit> findById(Long aLong) {
        return this.repository.findById(aLong);
    }

    @Override
    public void deleteById(long aLong) {
        this.repository.deleteById(aLong);
    }

    @Override
    public Produit save(Produit entity) {
        return this.repository.save(entity);
    }
}
