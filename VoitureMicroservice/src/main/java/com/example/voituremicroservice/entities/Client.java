package com.example.voituremicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    // annotation pour dire que l'attribut Id est une clé de la classe Client @Id
    // pour générer les valeurs d'Id automatiquement
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private Float age;
}

