/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "RUTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rutas.findAll", query = "SELECT r FROM Rutas r"),
    @NamedQuery(name = "Rutas.findByIdruta", query = "SELECT r FROM Rutas r WHERE r.idruta = :idruta"),
    @NamedQuery(name = "Rutas.findByNombre", query = "SELECT r FROM Rutas r WHERE r.nombre = :nombre")})
public class Rutas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRUTA")
    private Integer idruta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @NotNull
    @Column(name = "IDESTATUS")
    private Integer idestatus;
    @NotNull
    @Column(name = "IDEMPRESATRANSPORTE")
    private BigDecimal idempresatransporte;

    public Rutas() {
    }

    public Rutas(Integer idruta) {
        this.idruta = idruta;
    }

    public Rutas(Integer idruta, String nombre) {
        this.idruta = idruta;
        this.nombre = nombre;
    }

    public Integer getIdruta() {
        return idruta;
    }

    public void setIdruta(Integer idruta) {
        this.idruta = idruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idruta != null ? idruta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rutas)) {
            return false;
        }
        Rutas other = (Rutas) object;
        if ((this.idruta == null && other.idruta != null) || (this.idruta != null && !this.idruta.equals(other.idruta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Rutas[ idruta=" + idruta + " ]";
    }

    /**
     * @return the idestatus
     */
    public Integer getIdestatus() {
        return idestatus;
    }

    /**
     * @param idestatus the idestatus to set
     */
    public void setIdestatus(Integer idestatus) {
        this.idestatus = idestatus;
    }

    /**
     * @return the idempresatransporte
     */
    public BigDecimal getIdempresatransporte() {
        return idempresatransporte;
    }

    /**
     * @param idempresatransporte the idempresatransporte to set
     */
    public void setIdempresatransporte(BigDecimal idempresatransporte) {
        this.idempresatransporte = idempresatransporte;
    }
    
}
