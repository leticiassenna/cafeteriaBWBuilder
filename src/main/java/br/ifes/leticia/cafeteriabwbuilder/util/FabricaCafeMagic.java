/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.util;

import br.ifes.leticia.cafeteriabwbuilder.cdp.Cafe;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.HashMap;

/**
 *
 * @author Leticia
 */
public class FabricaCafeMagic {
    private static HashMap<String,Builder> builders = new HashMap<>();
    private FabricaCafeMagic(){
        
        builders.put("CafeNormal", new CafeNormalBuilder());
        builders.put("CafeDescafeinado", new CafeDescafeinadoBuilder());
        builders.put("CafeCappuccino", new CafeCappuccinoBuilder());
    }

    public static Cafe criarCafe(String nome) {

        Atendente atendente = new Atendente();
        Builder builder = builders.get(nome);
        Cafe cafe = atendente.fazerCafe((BuilderAbstrato) builder, nome);
       
        return cafe;
    }
}
