package com.example.grandmagasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id",referencedColumnName = "id")
    private Client client;

    @OneToMany
    @JoinColumn(name = "produit.id", referencedColumnName = "id")
    private Set<Produit> produit;

}
