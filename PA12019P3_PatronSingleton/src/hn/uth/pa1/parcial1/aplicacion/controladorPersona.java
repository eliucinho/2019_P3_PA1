/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.aplicacion;

import hn.uth.pa1.parcial1.aplicacion.objetos.Persona;

/**
 *
 * @author uth
 */
public class controladorPersona {
    public static Persona personaActual;
    
    public static void 
        setPersonaActual(Persona persona){
            personaActual=persona;
    }
        
    public static Persona 
        getPersonaActual(){
            return personaActual;
    }    
}
