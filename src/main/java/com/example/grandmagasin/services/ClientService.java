package com.example.grandmagasin.services;

import com.example.grandmagasin.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> TrouverTousClients();
    public Optional<Client> findById(Long aLong);

    public void deleteById(long aLong);
    public Client save (Client entity);

}
