/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.util;

import br.ifes.leticia.cafeteriabwbuilder.cdp.Agua;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwbuilder.cdp.PoCafe;

/**
 *
 * @author Leticia
 */
public class FabricaCafeCappuccino implements Fabrica{

    @Override
    public Agua criarAgua() {
        return new Agua();
    }

    @Override
    public PoCafe criarPoCafe() {
        return new PoCafe("Cafe Soluvel");
    }

    @Override
    public Ingrediente criarIngrediente() {
        Cafe cafe = new Cafe();
              
        Ingrediente ingrediente = Ingrediente.CAFE_SOLUVEL;
        ingrediente.setQuantidade("100g");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.ACUCAR;
        ingrediente.setQuantidade("200g");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.LEITE;
        ingrediente.setQuantidade("100ml");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.AGUA;
        ingrediente.setQuantidade("100ml");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.BICARBONATO;
        ingrediente.setQuantidade("1g");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.CHOCOLATE;
        ingrediente.setQuantidade("50g");
        cafe.setIngrediente(ingrediente);
        
        ingrediente = Ingrediente.CANELA;
        ingrediente.setQuantidade("1g");
        cafe.setIngrediente(ingrediente);
        
        return ingrediente;
    }

    @Override
    public Cafe criarCafe() {
        return new Cafe();
    }
    
}
