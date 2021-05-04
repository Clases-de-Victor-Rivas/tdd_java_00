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
    
    // Puntos que tiene el equipo
    int puntos;
    
    
    // Máximo número de puntos que puede tener un equipo
    // Si hay 20 equipos, cada equipo juega 19*2 partidos
    // Cada partido que gana son 3 puntos
    static int MAX_PUNTOS = 19*2*3;
    /**
     * Constructor
     * @param nombre Nombre del equipo
     * @param puntos Puntos que tiene el equipo
     */
    public Equipo( String nombre
        , int puntos ) {
        this.nombre=nombre;
        this.puntos=puntos;
    }
    
    /**
     * Getter
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Setter 
     * @param nuevoNombre 
     * @return Referencia al objeto para encadenar métodos
     */
    public Equipo setNombre( String nuevoNombre ) {
        if( nuevoNombre!=null && nuevoNombre!="" ) {
            nombre=nuevoNombre;
        }
        return this;
    }
    
    /**
     * Getter
     * @return puntos
     */
    public int getPuntos() {
        return puntos;
    }
    
    /**
     * Setter
     * @param nuevosPuntos
     * @return Referencia al objeto para encadenar métodos
     */
    public Equipo setPuntos( int nuevosPuntos ) {
        if( nuevosPuntos>=0 && nuevosPuntos<=MAX_PUNTOS ) {
            puntos=nuevosPuntos;
        }
        return this;
    }
    
 }
