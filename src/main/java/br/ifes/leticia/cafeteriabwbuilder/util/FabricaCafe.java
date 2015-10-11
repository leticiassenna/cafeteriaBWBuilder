/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.util;

import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeNormal;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwbuilder.cdp.PoCafe;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class FabricaCafe implements Fabrica{
    
    private Cafe cafe;
    private Fabrica fabrica;
    
    @Override
    public  Cafe criarCafe(String nome){
        
        if ("CafeNormal".equals(nome)){
            fabrica = new FabricaCafeNormal();
            cafe = fabrica.criarCafe(nome);
            cafe.setIngredientes(fabrica.criarIngrediente());
            cafe.setPoCafe(fabrica.criarPoCafe(nome));
            
        }

        if ("CafeDescafeinado".equals(nome)){
            fabrica = new FabricaCafeDescafeinado();
            cafe = fabrica.criarCafe(nome);
            cafe.setIngredientes(fabrica.criarIngrediente());
            cafe.setPoCafe(fabrica.criarPoCafe(nome));
            
        }
        if ("CafeCappuccino".equals(nome)){
            fabrica = new FabricaCafeCappuccino();
            cafe = fabrica.criarCafe(nome);
            cafe.setIngredientes(fabrica.criarIngrediente());
            cafe.setPoCafe(fabrica.criarPoCafe(nome));
        }
        
        return cafe;
    }

    

    @Override
    public PoCafe criarPoCafe(String tipo) {
        return new PoCafe(tipo);
    }

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        return fabrica.criarIngrediente();
        
    }
    
}
