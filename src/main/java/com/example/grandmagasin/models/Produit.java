package com.example.grandmagasin.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produit_id;

    private String nom;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "categorie_id", referencedColumnName = "")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "commande_id", referencedColumnName = "")
    private Commande commande;
}
