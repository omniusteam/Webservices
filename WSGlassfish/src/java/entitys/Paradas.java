/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "PARADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paradas.findAll", query = "SELECT p FROM Paradas p"),
    @NamedQuery(name = "Paradas.findByIdparada", query = "SELECT p FROM Paradas p WHERE p.idparada = :idparada"),
    @NamedQuery(name = "Paradas.findByNombre", query = "SELECT p FROM Paradas p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Paradas.findByDireccion", query = "SELECT p FROM Paradas p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Paradas.findByLatitud", query = "SELECT p FROM Paradas p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "Paradas.findByLongitud", query = "SELECT p FROM Paradas p WHERE p.longitud = :longitud"),
    @NamedQuery(name = "Paradas.findByIdruta", query = "SELECT p FROM Paradas p INNER JOIN Rutas r ON r.idparada = p.idparada WHERE r.idruta = :idruta")})
public class Paradas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARADA")
    private Integer idparada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LATITUD")
    private double latitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LONGITUD")
    private double longitud;
   

    public Paradas() {
    }

    public Paradas(Integer idparada) {
        this.idparada = idparada;
    }

    public Paradas(Integer idparada, String nombre, String direccion, double latitud, double longitud) {
        this.idparada = idparada;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Integer getIdparada() {
        return idparada;
    }

    public void setIdparada(Integer idparada) {
        this.idparada = idparada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparada != null ? idparada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paradas)) {
            return false;
        }
        Paradas other = (Paradas) object;
        if ((this.idparada == null && other.idparada != null) || (this.idparada != null && !this.idparada.equals(other.idparada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Paradas[ idparada=" + idparada + " ]";
    }
    
}
