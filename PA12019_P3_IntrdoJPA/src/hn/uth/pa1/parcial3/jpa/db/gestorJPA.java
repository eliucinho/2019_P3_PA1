/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial3.jpa.db;

import hn.uth.pa1.parcial3.jpa.entitys.Humanos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author uth
 */
public class gestorJPA {

    private static EntityManager em;

    public static void showError(String funcion, String mensaje) {
        System.out.println("Error " + funcion + ": " + mensaje);
    }

    public static EntityManager getEm() {
        try {
            String pu = "uthDBPU";

            EntityManagerFactory ef
                    = Persistence.createEntityManagerFactory(pu);
            return ef.createEntityManager();
        } catch (Exception e) {
            showError("getEm", e.toString());
        }
        return null;
    }

    public static void insertarHumano(Humanos humano) {
        iniciarTransaccion();
        em.persist(humano);
        guardarCambios();
    }

    public static Humanos getHumano(String identidad) {
        return em.find(Humanos.class, identidad);
    }

    public static void eliminarHumano(Humanos humano) {
        iniciarTransaccion();
        String identidad=humano.getIdentidad();
        Humanos humanoConsultado=getHumano(identidad);
        em.remove(humanoConsultado);
        guardarCambios();
    }

    public static void actualizarHumano(Humanos humano) {
        iniciarTransaccion();
        
        String identidad=humano.getIdentidad();
        Humanos humanoConsultado=gestorJPA.getHumano(identidad);
        humanoConsultado.setNombre(humano.getNombre());
        humanoConsultado.setApellido(humano.getApellido());
        humanoConsultado.setAnioNacimiento(humano.getAnioNacimiento());
        humanoConsultado.setDireccion(humano.getDireccion());
        em.persist(humanoConsultado);
        guardarCambios();
    }
    
    public static void iniciarTransaccion(){
        em=getEm();
        em.getTransaction().begin();
    }
    
    public static void guardarCambios(){
        em.getTransaction().commit();
    }
}
