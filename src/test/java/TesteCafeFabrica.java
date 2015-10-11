/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafe;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeCappuccino;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeDescafeinado;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeNormal;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Leticia
 */
public class TesteCafeFabrica {
    private final FabricaCafe fabricaCafe = new FabricaCafe();
    
    public TesteCafeFabrica() {
    }
    
        
    @Test
    public void testFactoryCafeNormal() 
    {
        
        Cafe cafe = fabricaCafe.criarCafe("CafeNormal");
        Assert.assertSame(cafe.getNome(), "Normal");
    }
    
    @Test
    public void testFactoryCafeCappuccino() 
    {
        
        Cafe cafe = fabricaCafe.criarCafe("CafeCappuccino");
        Assert.assertSame(cafe.getNome(), "Cappuccino");
    }
    
    @Test
    public void testFactoryCafeDescafeinado() 
    {
        
        Cafe cafe = fabricaCafe.criarCafe("CafeDescafeinado");
        Assert.assertSame(cafe.getNome(), "Descafeinado");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
