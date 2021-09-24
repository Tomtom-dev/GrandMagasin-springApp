package com.example.grandmagasin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

}
