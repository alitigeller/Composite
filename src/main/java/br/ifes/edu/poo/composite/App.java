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
public class App {
    public static void main(String[] args) {
        Bloco blocoA = new Bloco("A) Formação Educacional");
        Questao questao1 = new Questao("Qual sua formação?");
        Questao questao2 = new Questao("Pretende fazer alguma pós-graduação?");

        blocoA.Adicionar(questao1);
        blocoA.Adicionar(questao2);

        Bloco blocoB = new Bloco("B) Habilidades");
        Bloco blocoB1 = new Bloco("B1) Habilidades Técnicas");
        Questao questao3 = new Questao("O que é SOLID?");

        blocoB1.Adicionar(questao3);
        blocoB.Adicionar(blocoB1);

        Bloco blocoRaiz = new Bloco("Inicio");
        blocoRaiz.Adicionar(blocoA);
        blocoRaiz.Adicionar(blocoB);

        // exibindo toda a estrutura
        blocoRaiz.Exibir();
    }
}
