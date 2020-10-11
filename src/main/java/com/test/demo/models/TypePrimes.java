package com.test.demo.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "type_prime")
public class TypePrimes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "libelle")
    private String libelle;

    public TypePrimes(Long id, String libelle) {
        Id = id;
        this.libelle = libelle;
    }

    public TypePrimes() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
