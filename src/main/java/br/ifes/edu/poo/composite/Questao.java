/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.composite;

/**
 *
 * @author Alessandro Eller
 */
public class Questao extends ElementoDoQuestionario
{

    public Questao(String descricao) {
        super(descricao);
    }

    @Override
    public void Exibir() {
        System.out.println("Questão: " + Descricao);
    }
    
}