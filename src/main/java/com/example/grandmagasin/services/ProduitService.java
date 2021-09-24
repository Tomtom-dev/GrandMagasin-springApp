package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Client;
import com.example.grandmagasin.models.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    public List<Produit> TrouverTousClients();
    public Optional<Produit> findById(Long aLong);

    public void deleteById(long aLong);
    public Produit save (Produit entity);
}
