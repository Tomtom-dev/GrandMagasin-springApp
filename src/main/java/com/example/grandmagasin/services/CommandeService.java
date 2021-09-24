package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {
    public List<Commande> TrouverToutesCommandes();
    public Optional<Commande> findById(Long aLong);

    public void deleteById(long aLong);
    public Commande save (Commande entity);
}
