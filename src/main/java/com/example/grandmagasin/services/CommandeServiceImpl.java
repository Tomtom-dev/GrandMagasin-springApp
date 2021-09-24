package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Commande;
import com.example.grandmagasin.repositories.CommandeRepository;

import java.util.List;
import java.util.Optional;

public class CommandeServiceImpl implements CommandeService{

    private CommandeRepository repository;

    public CommandeServiceImpl(CommandeRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Commande> TrouverToutesCommandes() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Commande> findById(Long aLong) {
        return this.repository.findById(aLong);
    }

    @Override
    public void deleteById(long aLong) {
        this.repository.deleteById(aLong);
    }

    @Override
    public Commande save(Commande entity) {
        return this.repository.save(entity);
    }
}
