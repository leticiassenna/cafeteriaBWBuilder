/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.util;

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;

/**
 *
 * @author Leticia
 */
public interface Builder {
    
    
    public void prepararPoCafe(String tipo);
    public void prepararIngredientes();
    public Cafe servirCafe(String nomeCafe);
    
}
