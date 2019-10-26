/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.aplicacion;

import hn.uth.pa1.parcial1.aplicacion.objetos.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class controlador {

    private static List<Persona> listaPersonas = new ArrayList<>();

    public static void guardarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public static Object[][] getListaPersona() {
        Object[][] listaArray
                = new Object[listaPersonas.size()][5];

        int indice = 0;
        for (Persona personaTmp : listaPersonas) {
            listaArray[indice][0] = personaTmp.getIdentidad();
            listaArray[indice][1] = personaTmp.getNombre();
            listaArray[indice][2] = personaTmp.getApellido();
            listaArray[indice][3] = personaTmp.getAnioNacimiento();
            listaArray[indice][4] = personaTmp.getDireccion();
            indice++;
        }

        return listaArray;
    }

    public static String[] getColumnasPersona() {
        return new String[]{
            "Identidad", "Nombre", "Apellido", "Año Nacimiento", "Direccion"
        };
    }
}
