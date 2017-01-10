/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Maribel Medina
 */
@Entity @Table(name= "nameSource")
public class NameSource implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_source", length=10)
    private Long idSource;
    @Column(length = 30)
    private String sourceDbName;
    @Column(length = 30)
    private String oraSchemaName;
    @Column(length = 30)
      private String url;
    
     public NameSource(){
        this.idSource= 0L;
    }

    public Long getIdSource() {
        return idSource;
    }

    public void setIdSource(Long idSource) {
        this.idSource = idSource;
    }

    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public String getOraSchemaName() {
        return oraSchemaName;
    }

    public void setOraSchemaName(String oraSchemaName) {
        this.oraSchemaName = oraSchemaName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


   


   

   
     
     
}//final
