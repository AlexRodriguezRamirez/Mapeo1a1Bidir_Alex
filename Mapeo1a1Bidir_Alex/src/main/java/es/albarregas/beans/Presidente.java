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
public class Presidente implements Serializable {
    
    private int idPresidente;
    private String nombrePresidente;
    private Pais pais;

    public Presidente() {
    }

    public Presidente(int idPresidente, String nombrePresidente, Pais pais) {
        this.idPresidente = idPresidente;
        this.nombrePresidente = nombrePresidente;
        this.pais = pais;
    }

    public int getIdPresidente() {
        return idPresidente;
    }

    public void setIdPresidente(int idPresidente) {
        this.idPresidente = idPresidente;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}
