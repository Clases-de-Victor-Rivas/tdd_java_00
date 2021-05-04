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
public class Equipo {
    
    // Nombre del equipo
    String nombre;
    
    /**
     * Constructor
     * @param nombre Nombre del equipo
     */
    public Equipo( String nombre ) {
        this.nombre=nombre;
    }
    
    /**
     * Getter
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre( String nuevoNombre ) {
        if( nuevoNombre!=null && nuevoNombre!="" ) {
            nombre=nuevoNombre;
        }
    }
}
