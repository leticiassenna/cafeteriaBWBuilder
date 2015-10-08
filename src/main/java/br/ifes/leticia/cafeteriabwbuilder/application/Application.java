/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.application;

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.PoCafe;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafe;

/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String [] xxx) 
    {
        Cafe cafe = FabricaCafe.criarCafe("Cafe Normal");
        
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("Cafe Cappuccino");
        System.out.println(cafe);
        
        PoCafe poCafe = new PoCafe();
        poCafe.setTipo("Soluvel");
        System.out.println(poCafe);
        
        PoCafe poCafe2 = new PoCafe();
        poCafe2.setTipo("Descafeinado");
        System.out.println(poCafe2);
        
        
            
        
    }
}
