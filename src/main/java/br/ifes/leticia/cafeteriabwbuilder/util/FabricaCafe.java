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
public class FabricaCafe {
    
    public static Cafe criarCafe(String nome){
        Fabrica fabrica;
        if (nome.equals("CafeNormal")){
            fabrica = new FabricaCafeNormal();
        }
        else{
            if (nome.equals("CafeDescafeinado")){
                fabrica = new FabricaCafeDescafeinado();
            }
            else fabrica = new FabricaCafeCappuccino();
        }
        
        Cafe cafe = fabrica.criarCafe();
        cafe.setAgua(fabrica.criarAgua());
        cafe.setPoCafe(fabrica.criarPoCafe());
        cafe.setIngrediente(fabrica.criarIngrediente());
        
        return cafe;
    }
    
}