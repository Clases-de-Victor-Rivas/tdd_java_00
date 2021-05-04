/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.vrivas.tdd_java_00;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vrivas
 */
public class PartidoTest {
    static Partido p=null;
    static Equipo local=null;
    static Equipo visitante=null;
    
    public PartidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        local=new Equipo( "LOCAL 01", 11 );
        visitante=new Equipo( "VISITANTE 02", 22 );
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void constructor() {
        System.out.println( "Constructor de Partido" );
        p=new Partido( local, visitante );
        
        // Compruebo que el constructor funciona bien
        assertSame( p.getLocal(), local );
        assertSame( p.getVisitante(), visitante );
        
    }
    
}
