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
public abstract class ElementoDoQuestionario
{
    protected String Descricao;
 
    protected ElementoDoQuestionario(String descricao)
    {
        Descricao = descricao;
    }
    public abstract void Exibir();
}