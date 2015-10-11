/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwbuilder.cdp;

import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class Cafe {
    
    private String nome;
    private PoCafe poCafe;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    private float preco;



    public PoCafe getPoCafe() {
        return poCafe;
    }

    public void setPoCafe(PoCafe poCafe) {
        this.poCafe = poCafe;
    }

   
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
       

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void Informacao(Cafe cafe) {
        System.out.println("Cafe {" + "tipo = " + cafe.getNome() +
                ", po de cafe = " + cafe.getPoCafe().getTipo() + 
                 ", preco = " + cafe.getPreco() + '}');
        for (Ingrediente item: ingredientes){
            
            System.out.println(item.getNome()+" = "+ item.getQuantidade());
        }
        
    }


}
