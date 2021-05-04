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
    
    static final int LOCAL_PTOS_INICIALES = 11;
    static final int VISITANTE_PTOS_INICIALES = 11;
    
    
    public PartidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        local=new Equipo( "LOCAL 01", LOCAL_PTOS_INICIALES );
        visitante=new Equipo( "VISITANTE 02", VISITANTE_PTOS_INICIALES );
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
        assertEquals( p.getGolesLocal(), Partido.GOLES_NULOS );       
    }
    
    @Test
    public void estableceResultado() {
        System.out.println( "Establece resultado de Partido" );
        
        // compruebo la victoria local
        p.estableceResultado( 3, 2 );
        assertEquals( p.getLocal().getPuntos(), LOCAL_PTOS_INICIALES+3 );
        assertEquals( p.getVisitante().getPuntos(), VISITANTE_PTOS_INICIALES );
        
        
        // compruebo la victoria visitante
        p.estableceResultado( 1, 5 );
        assertEquals( p.getLocal().getPuntos(), LOCAL_PTOS_INICIALES+3);
        assertEquals( p.getVisitante().getPuntos(), VISITANTE_PTOS_INICIALES+3 );
        
        // compruebo el empate
        p.estableceResultado( 3, 3 );
        assertEquals( p.getLocal().getPuntos(), LOCAL_PTOS_INICIALES+3+1);
        assertEquals( p.getVisitante().getPuntos(), VISITANTE_PTOS_INICIALES+3+1 );
    }
}
