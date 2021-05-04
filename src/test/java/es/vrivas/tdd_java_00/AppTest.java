/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.vrivas.tdd_java_00;

import static es.vrivas.tdd_java_00.App.MAX_EQUIPOS;
import static es.vrivas.tdd_java_00.App.equipos;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vrivas
 */
public class AppTest {
    static Equipo[] equipos=new Equipo[App.MAX_EQUIPOS];
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println( "setUpClass para AppTest" );
        // Mock data
        for( int i=0; i<App.MAX_EQUIPOS; ++i ) {
            equipos[i]=new Equipo( "Equipo "+(i+1), 0 );
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void iniciaEquipos() {
        System.out.println( "Test iniciaEquipos" );
        App.iniciaEquipos();
        assertEquals(App.getEquipos()[0].getNombre(), equipos[0].getNombre() );
        assertEquals(App.getEquipos()[0].getPuntos(), equipos[0].getPuntos() );
        
        // Comparo usando mejor toString de los objetos.
        assertEquals(App.getEquipos()[0].toString(), equipos[0].toString() );
        assertEquals(App.getEquipos()[App.MAX_EQUIPOS-1].toString(), equipos[App.MAX_EQUIPOS-1].toString() );
        
    }
    
}
