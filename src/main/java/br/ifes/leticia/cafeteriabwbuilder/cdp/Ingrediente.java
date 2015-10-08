/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.cdp;

/**
 *
 * @author Leticia
 */
public enum Ingrediente {
    CAFE_SOLUVEL, CAFE_DESCAFEINADO, ACUCAR, LEITE,
    BICARBONATO, CHOCOLATE, CANELA, AGUA;
    public String quantidade;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
