/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial3.jpa.entitys;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author uth
 */
@Entity
@Table(name = "HUMANOS", catalog = "", schema = "UTH")
@NamedQueries({
    @NamedQuery(name = "Humanos.findAll", query = "SELECT h FROM Humanos h")
    , @NamedQuery(name = "Humanos.findByIdentidad", query = "SELECT h FROM Humanos h WHERE h.identidad = :identidad")
    , @NamedQuery(name = "Humanos.findByNombre", query = "SELECT h FROM Humanos h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Humanos.findByApellido", query = "SELECT h FROM Humanos h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "Humanos.findByAnioNacimiento", query = "SELECT h FROM Humanos h WHERE h.anioNacimiento = :anioNacimiento")
    , @NamedQuery(name = "Humanos.findByDireccion", query = "SELECT h FROM Humanos h WHERE h.direccion = :direccion")})
public class Humanos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDENTIDAD")
    private String identidad;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "ANIO_NACIMIENTO")
    private Integer anioNacimiento;
    @Column(name = "DIRECCION")
    private String direccion;

    public Humanos() {
    }

    public Humanos(String identidad) {
        this.identidad = identidad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        String oldIdentidad = this.identidad;
        this.identidad = identidad;
        changeSupport.firePropertyChange("identidad", oldIdentidad, identidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        Integer oldAnioNacimiento = this.anioNacimiento;
        this.anioNacimiento = anioNacimiento;
        changeSupport.firePropertyChange("anioNacimiento", oldAnioNacimiento, anioNacimiento);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identidad != null ? identidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Humanos)) {
            return false;
        }
        Humanos other = (Humanos) object;
        if ((this.identidad == null && other.identidad != null) || (this.identidad != null && !this.identidad.equals(other.identidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Humanos[ identidad=" + identidad + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
