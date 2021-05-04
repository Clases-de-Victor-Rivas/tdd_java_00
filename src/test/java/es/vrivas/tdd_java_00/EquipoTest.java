/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.vrivas.tdd_java_00;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vrivas
 */
public class EquipoTest {
    private static Equipo e=null;
    private static String NOMBRE_01="Recreativo de Huelva";
    
    public EquipoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println( "setUpClass");
        e=new Equipo(NOMBRE_01);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println( "tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println( "setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println( "tearDown");
    }

    @Test
    public void constructor() {
        System.out.println( "constructor");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals( e.getNombre(), NOMBRE_01 );
    }
    
    @Test
    public void setNombre() {
        System.out.println( "setNombre");
        asserEquals( e.setNombre(""), "" );
    }
}
