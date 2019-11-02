/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.p2.aplicacion;

import hn.uth.pa1.p2.bd.gestorDB;
import hn.uth.pa1.p2.objetos.Humano;
import java.util.List;

/**
 *
 * @author uth
 */
public class programa {
    public static void main(String [] args){
        Humano humano=new Humano("9999", "pepito", "x", 2015, "la ceiba");
        gestorDB
                .guardarHumano(humano);
        
        humano.setNombre("Marco");
        humano.setApellido("Soto");
        gestorDB.actualizarHumano(humano);
        
        gestorDB.eliminarHumano(humano);
        
        List<Humano> listaPrueba=gestorDB.getHumanos();
        for (Humano variableTMP : listaPrueba) {
            System.out.println("valor: "+variableTMP);
        }
    
        gestorDB
                .guardarHumano(new Humano("9229", "pepito3", "x", 2018, "la ceiba"));
        
        listaPrueba=gestorDB.getHumanos();
        for (Humano variableTMP : listaPrueba) {
            System.out.println("valor2: "+variableTMP);
        }
    }
}
