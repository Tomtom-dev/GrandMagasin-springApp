package com.example.grandmagasin.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private Float prix;


    @OneToOne
    @JoinColumn(name = "categorie_id", referencedColumnName = "id")
    private Categorie categorie;
}
