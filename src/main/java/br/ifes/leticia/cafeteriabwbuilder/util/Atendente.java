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
public class Atendente implements Director{

    @Override
    public Cafe fazerCafe(Builder atendente) {
        Cafe cafe;
        atendente.prepararAgua();
        atendente.prepararPoCafe();
        atendente.prepararIngredientes();
        cafe = atendente.servirCafe();
        return cafe;
    }
    
    
}
