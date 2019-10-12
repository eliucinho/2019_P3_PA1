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
    private String identidad;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private String sexo;
    private String departamento;
    private String municipio;

    public Persona(String identidad, String nombre, String apellido, int anioNacimiento, String sexo, String departamento, String municipio) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
        this.municipio = municipio;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Persona{" + "identidad=" + identidad + ", nombre=" + nombre + ", apellido=" + apellido + ", anioNacimiento=" + anioNacimiento + ", sexo=" + sexo + ", departamento=" + departamento + ", municipio=" + municipio + '}';
    }
    
}
