package com.example.grandmagasin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commande_id;

    @ManyToOne
    @JoinColumn(name = "client_id",referencedColumnName = "id")
    private Client client;


}
