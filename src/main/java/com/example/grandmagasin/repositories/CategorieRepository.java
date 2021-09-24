package com.example.grandmagasin.repositories;

import com.example.grandmagasin.models.Categorie;
import com.example.grandmagasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
