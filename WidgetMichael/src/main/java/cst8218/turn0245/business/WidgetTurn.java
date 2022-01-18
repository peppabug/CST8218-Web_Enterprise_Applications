/*
 * 040863378
 */
package cst8218.turn0245.business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Michael
 */
@Entity
@XmlRootElement
public class WidgetTurn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name3378;
    private Integer quantity3378;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName3378() {
        return name3378;
    }
    
    public void setName3378(String name3378) {
        this.name3378 = name3378;
    }
    
    public Integer getQuantity3378() {
        return quantity3378;
    }
    
    public void setQuantity3378(Integer quantity3378) {
        this.quantity3378 = quantity3378;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WidgetTurn)) {
            return false;
        }
        WidgetTurn other = (WidgetTurn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.widgetappmichael.WidgetF20Turn[ id=" + id + " ]";
    }
    
}
