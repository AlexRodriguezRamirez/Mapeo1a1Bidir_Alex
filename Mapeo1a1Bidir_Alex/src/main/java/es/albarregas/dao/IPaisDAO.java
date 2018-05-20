/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Pais;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IPaisDAO {
    
    public void add(Pais pais);
    public List<Pais> get();
    public Pais getOne(int pk);
    public void update(Pais pais);
    public void delete(Pais pais);
}
