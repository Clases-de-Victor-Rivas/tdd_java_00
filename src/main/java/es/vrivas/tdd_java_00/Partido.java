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
public class Partido {
    // Equipos
    Equipo local=null, visitante=null;
    
    /**
     * Getter local
     * @return equipo local
     */
    public Equipo getLocal() {
        return local;
    }
    
    /**
     * Getter visitante
     * @return equipo visitante
     */
    public Equipo getVisitante() {
        return visitante;
    }
    
    /**
     * Constructor
     * @param local Equipo Local
     * @param visitante Equipo visitante
     */
    public Partido( Equipo local, Equipo visitante ) {
        this.local=local;
        this.visitante=visitante;
    }
}
