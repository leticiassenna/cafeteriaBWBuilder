/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import br.ifes.leticia.cafeteriabwbuilder.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwbuilder.util.Atendente;
import br.ifes.leticia.cafeteriabwbuilder.util.BuilderAbstrato;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafe;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeCappuccino;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeDescafeinado;
import br.ifes.leticia.cafeteriabwbuilder.util.FabricaCafeNormal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leticia
 */
public class TesteBuilder {
    private final FabricaCafe fabricaCafe = new FabricaCafe();
    private final Atendente atendente = new Atendente();
    private final Atendente atendenteFaz = new Atendente();
    private final BuilderAbstrato atendente2 = new BuilderAbstrato() {} ;
    
    @Test
    public void TestBuilderCafeNormal() {
        
        Cafe cafe = atendenteFaz.fazerCafe(atendente2, "CafeNormal");
        cafe.setPoCafe(cafe.getPoCafe());
        Assert.assertSame(cafe.getPoCafe().getTipo(), "Cafe Soluvel");
    }
    
    @Test
    public void TestBuilderCafeCappuccino() {
        
        Cafe cafe = atendenteFaz.fazerCafe(atendente2, "CafeCappuccino");
        cafe.setPoCafe(cafe.getPoCafe());
        Assert.assertSame(cafe.getPoCafe().getTipo(), "Cafe Soluvel");
        
    }
    
    @Test
    public void TestBuilderCafeDescafeinado() {
        
        Cafe cafe = atendenteFaz.fazerCafe(atendente2, "CafeDescafeinado");
        cafe.setPoCafe(cafe.getPoCafe());
        Assert.assertSame(cafe.getPoCafe().getTipo(), "Cafe Descafeinado");
        
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
