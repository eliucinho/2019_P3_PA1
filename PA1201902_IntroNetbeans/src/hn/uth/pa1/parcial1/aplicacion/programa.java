/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.aplicacion;

import hn.uth.pa1.parcial1.aplicacion.objetos.*;

/**
 *
 * @author uth
 */
public class programa {

    public static void main(String[] args) {
        System.out.println("Hola uth");
        String saludo = "hola mundo";
        Persona alumno = 
                new Persona("0801", 
                        "Eliud", 
                        120, 
                        185.2);
        System.out.println
            ("Objeto creado: "+alumno);                
    }
}
