/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.vrivas.tdd_java_00;

/**
 *
 * @author vrivas
 */
public class App {
    // Constante para definir el máximo número de equipos
    public static final int MAX_EQUIPOS = 20;
    
    // Vector con los equipos
    static Equipo[] equipos=new Equipo[MAX_EQUIPOS];
    
    // Inicializa los nombres y puntos de los equipos
    public static void iniciaEquipos() {
        for( int i=0; i<MAX_EQUIPOS; ++i ) {
            equipos[i]=new Equipo( "Equipo "+(i+1), 0 );
        }
    }
    
    // Muestra los equipos
    public static void muestraEquipos( String cabecera ) {
        System.out.println( cabecera );
        for( int i=0; i<MAX_EQUIPOS; ++i ) {
            System.out.println( equipos[i].toString() );
        }    
    }
    
    // Devuelve el vector de equipos
    public static Equipo[] getEquipos() {
        return equipos;
    }
    
    /**
     * Main function
     */
    public static void main(String[] args) {
    System.out.println( "Inicio ejecución del programa." );
        iniciaEquipos();
        muestraEquipos("");
    }
}
