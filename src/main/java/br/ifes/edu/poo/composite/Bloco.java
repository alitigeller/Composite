/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alessandro Eller
 */
public class Bloco extends ElementoDoQuestionario
{
    private List<ElementoDoQuestionario> elementos = new ArrayList<ElementoDoQuestionario>();

    public Bloco(String descricao) {
        super(descricao);
    }
    
 
        
 
    @Override
    public  void Exibir()
    {
        System.out.println("BLoco: " + Descricao);
        for (ElementoDoQuestionario elemento : elementos)
            elemento.Exibir();
    }
 
    public void Adicionar(ElementoDoQuestionario elemento)
    {
        elementos.add(elemento);
          
    }

    public List<ElementoDoQuestionario> getElementos() {
        return elementos;
    }

    public void setElementos(List<ElementoDoQuestionario> elementos) {
        this.elementos = elementos;
    }
 
   
}
