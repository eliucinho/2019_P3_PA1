/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.aplicacion.objetos;

/**
 *
 * @author uth
 */
public class Persona {
    private String indentidad;
    private String nombre;
    private int peso;
    private double altura;

    //el constructor no tiene void y tampoco tipo
    //es el primer blóque de instruciones que
    //se ejecuta cuando se instancia una clase
    public Persona(String indentidad, String nombre, int peso, double altura) {
        this.indentidad = indentidad;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getIndentidad() {
        return this.indentidad;
    }

    public void setIndentidad(String indentidad) {
        this.indentidad = indentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "indentidad=" + indentidad + ", nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
