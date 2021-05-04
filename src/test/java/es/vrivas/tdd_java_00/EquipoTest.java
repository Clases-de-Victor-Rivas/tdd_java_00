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
    
    public EquipoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println( "setUpClass");
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
        System.out.println( "setUp");
    }

    @Test
    public void testSomeMethod() {
        System.out.println( "testSomeMethod");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
