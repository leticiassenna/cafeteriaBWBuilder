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
    protected FabricaCafe fabricaCafe;
    
    
    @Override
    public void prepararPoCafe(String tipo){
        cafe.setPoCafe(fabricaCafe.criarPoCafe(tipo));
    }
    
    @Override
    public void prepararIngredientes(){
        cafe.setIngredientes(fabricaCafe.criarIngrediente());
    }
    @Override
    public Cafe servirCafe(String nomeCafe){
        cafe = fabricaCafe.criarCafe(nomeCafe);
        return cafe;
    }
    
}
