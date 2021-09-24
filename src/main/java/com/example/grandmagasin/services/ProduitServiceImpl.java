package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Produit;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements ProduitService{

    private  ProduitRepository repository;

    public ProduitServiceImpl(){

    }

    @Override
    public List<Produit> TrouverTousClients() {
        return null;
    }

    @Override
    public Optional<Produit> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(long aLong) {

    }

    @Override
    public Produit save(Produit entity) {
        return null;
    }
}
