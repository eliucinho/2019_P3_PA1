/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.aplicacion.objetos;

/**
 *
 * @author Alumno
 */
public class Persona {
    private String identidad;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private String direccion;

    public Persona(String identidad, String nombre, String apellido, int anioNacimiento, String direccion) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        this.direccion = direccion;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "identidad=" + identidad + ", nombre=" + nombre + ", apellido=" + apellido + ", anioNacimiento=" + anioNacimiento + ", direccion=" + direccion + '}';
    }
    
    
}
