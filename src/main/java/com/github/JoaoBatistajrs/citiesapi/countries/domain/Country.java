package com.github.JoaoBatistajrs.citiesapi.countries.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// anotar depois com lombok

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private long Id;

    private String nome;

    private String nome_pt;

    private String sigla;

    private String bacen;

    public Country(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_pt() {
        return nome_pt;
    }

    public void setNome_pt(String nome_pt) {
        this.nome_pt = nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getBacen() {
        return bacen;
    }

    public void setBacen(String bacen) {
        this.bacen = bacen;
    }
}
