/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.application;

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.PoCafe;
import br.ifes.leticia.cafeteriabwbuilder.util.Atendente;
import br.ifes.leticia.cafeteriabwbuilder.util.BuilderAbstrato;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafe;

/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String [] xxx) 
    {
        
        FabricaCafe fabricaCafe = new FabricaCafe();
        Cafe cafe = fabricaCafe.criarCafe("CafeNormal");
        cafe.Informacao(cafe);
        
        cafe = fabricaCafe.criarCafe("CafeDescafeinado");
        cafe.Informacao(cafe);
        
        cafe = fabricaCafe.criarCafe("CafeCappuccino");
        cafe.Informacao(cafe);
        
        
            
        
    }
}
