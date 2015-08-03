/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.composite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alessandro Eller
 */
public class TEsteComposite {
    
    public TEsteComposite() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @org.junit.Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        
        Bloco instance = new Bloco("desc");
        Questao questao = new Questao("questão");
        instance.Adicionar(questao);
        assertEquals(instance.getElementos().size(), 1);
    }


    
}
