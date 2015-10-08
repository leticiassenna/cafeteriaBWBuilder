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
public interface Fabrica {
    
    public Agua criarAgua();
    public PoCafe criarPoCafe();
    public Ingrediente criarIngrediente();
    public Cafe criarCafe();
    
}
