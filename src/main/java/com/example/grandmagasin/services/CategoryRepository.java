package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Categorie;
import com.example.grandmagasin.models.Produit;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    public List<Categorie> TrouverTousClients();
    public Optional<Categorie> findById(Long aLong);

    public void deleteById(long aLong);
    public Produit save (Produit entity);
}
