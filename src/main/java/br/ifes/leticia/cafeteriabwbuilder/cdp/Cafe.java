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
public class Cafe {
    
    private Agua agua;
    private PoCafe poCafe;
    private Ingrediente ingrediente;


    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public PoCafe getPoCafe() {
        return poCafe;
    }

    public void setPoCafe(PoCafe poCafe) {
        this.poCafe = poCafe;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    @Override
    public String toString() {
        return "Cafe{" + "agua=" + agua + ", po de cafe=" + poCafe + ", ingredientes=" + ingrediente + '}';
    }
    
}
