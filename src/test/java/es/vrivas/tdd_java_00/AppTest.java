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
            System.out.println( equipos[i]);

        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void main() {
        System.out.println( "Test App.main");
        assertEquals( App.main(), 0 );
    }
    
    @Test
    public void iniciaEquipos() {
        System.out.println( "Test iniciaEquipos" );
        assertArrayEquals(App.getEquipos(), equipos );
    }
    
}
