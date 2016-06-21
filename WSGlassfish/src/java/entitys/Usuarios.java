/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByIdusuario", query = "SELECT u FROM Usuarios u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuarios.findByTiemporegistro", query = "SELECT u FROM Usuarios u WHERE u.tiemporegistro = :tiemporegistro"),
    @NamedQuery(name = "Usuarios.findByLatitud", query = "SELECT u FROM Usuarios u WHERE u.latitud = :latitud"),
    @NamedQuery(name = "Usuarios.findByLongitud", query = "SELECT u FROM Usuarios u WHERE u.longitud = :longitud")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    private Integer idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIEMPOREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiemporegistro;
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    
    @Column(name = "IDPARADA")
    private Integer idparada;
    
    @Column(name = "IDRUTAESPERA")
    private Integer idrutaespera;
    

    public Usuarios() {
    }

    public Usuarios(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuarios(Integer idusuario, Date tiemporegistro) {
        this.idusuario = idusuario;
        this.tiemporegistro = tiemporegistro;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Date getTiemporegistro() {
        return tiemporegistro;
    }

    public void setTiemporegistro(Date tiemporegistro) {
        this.tiemporegistro = tiemporegistro;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Usuarios[ idusuario=" + idusuario + " ]";
    }

    /**
     * @return the idparada
     */
    public Integer getIdparada() {
        return idparada;
    }

    /**
     * @param idparada the idparada to set
     */
    public void setIdparada(Integer idparada) {
        this.idparada = idparada;
    }

    /**
     * @return the idrutaespera
     */
    public Integer getIdrutaespera() {
        return idrutaespera;
    }

    /**
     * @param idrutaespera the idrutaespera to set
     */
    public void setIdrutaespera(Integer idrutaespera) {
        this.idrutaespera = idrutaespera;
    }
    
}
