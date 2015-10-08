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
public abstract class BuilderAbstrato implements Builder {
    
    protected Cafe cafe = new Cafe();
    
    protected Fabrica fabrica;
    
    @Override
    public void prepararAgua() {
        
        cafe.setAgua(fabrica.criarAgua());
    }
    
    @Override
    public void prepararPoCafe(){
        cafe.setPoCafe(fabrica.criarPoCafe());
    }
    
    @Override
    public void prepararIngredientes(){
        cafe.setIngrediente(fabrica.criarIngrediente());
    }
    @Override
    public Cafe servirCafe(){
        return cafe;
    }
    
}