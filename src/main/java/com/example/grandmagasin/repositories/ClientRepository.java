package com.example.grandmagasin.repositories;

import com.example.grandmagasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
