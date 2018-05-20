/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author Alex
 */
public class Pais implements Serializable {
    
    private int idPais;
    private String nombrePais;
    private Presidente presidente;

    public Pais() {
    }

    public Pais(int idPais, String nombrePais, Presidente presidente) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
        this.presidente = presidente;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }
    
    
}
