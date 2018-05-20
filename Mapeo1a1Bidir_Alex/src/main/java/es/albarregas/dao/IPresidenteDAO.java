/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Presidente;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IPresidenteDAO {
    
    public void add(Presidente presidente);
    public List<Presidente> get();
    public Presidente getOne(int pk);
    public void update(Presidente presidente);
    public void delete(Presidente presidente);
       
}
