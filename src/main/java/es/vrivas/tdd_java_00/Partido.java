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
   // Valor nulo para los goles
    public final static int GOLES_NULOS = -1000;
    
    // Equipos
    Equipo local=null, visitante=null;
    
    // Goles del resultado
    int golesLocal= GOLES_NULOS, golesVisitante=GOLES_NULOS;
    
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
     * Getter golesLocal
     * @return golesLocal
     */
    public int getGolesLocal() {
        return golesLocal;
    }
    
    /**
     * Establece el resultado en goles y modifica los puntos de los equipos
     * @param golesLocal Goles del equipo local
     * @param golesVisitante Goles del equipo visitante
     * @post El equipo que mete más goles suma 3 puntos; si empatan, cada uno suma 1 punto.
     */
    public void estableceResultado( int golesLocal, int golesVisitante ) {
        this.golesLocal=golesLocal;
        this.golesVisitante=golesVisitante;
        
        // Gana local
        if( golesLocal>golesVisitante ) {
            local.setPuntos(local.getPuntos()+3);
        }
        
        if( golesLocal<golesVisitante ) {
            visitante.setPuntos(visitante.getPuntos()+3);
        }

        if( golesLocal==golesVisitante ) {
            visitante.setPuntos(visitante.getPuntos()+1);
            local.setPuntos(local.getPuntos()+1);
        }       
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
