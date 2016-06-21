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
@Table(name = "CATALOGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogo.findAll", query = "SELECT c FROM Catalogo c"),
    @NamedQuery(name = "Catalogo.findByIdcatalogo", query = "SELECT c FROM Catalogo c WHERE c.idcatalogo = :idcatalogo"),
    @NamedQuery(name = "Catalogo.findByNombre", query = "SELECT c FROM Catalogo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Catalogo.findByOrden", query = "SELECT c FROM Catalogo c WHERE c.orden = :orden")})
public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCATALOGO")
    private Integer idcatalogo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN")
    private Integer orden;
    @Column(name = "IDCATEGORIA")
    private Integer idcategoria;
    
    

    public Catalogo() {
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdcatalogo() != null ? getIdcatalogo().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.getIdcatalogo() == null && other.getIdcatalogo() != null) || (this.getIdcatalogo() != null && !this.idcatalogo.equals(other.idcatalogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Catalogo[ idcatalogo=" + getIdcatalogo() + " ]";
    }

    /**
     * @return the idcatalogo
     */
    public Integer getIdcatalogo() {
        return idcatalogo;
    }

    /**
     * @param idcatalogo the idcatalogo to set
     */
    public void setIdcatalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the orden
     */
    public Integer getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    /**
     * @return the idcategoria
     */
    public Integer getIdcategoria() {
        return idcategoria;
    }

    /**
     * @param idcategoria the idcategoria to set
     */
    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }
    
}
