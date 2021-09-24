package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Client;
import com.example.grandmagasin.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService{

    private ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository){
        this.repository= repository;
    }

    @Override
    public List<Client> TrouverTousClients() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Client> findById(Long aLong) {
        return this.repository.findById(aLong);
    }

    @Override
    public void deleteById(long aLong) {
         this.repository.deleteById(aLong);
    }

    @Override
    public Client save(Client entity) {
        return this.repository.save(entity);
    }
}
