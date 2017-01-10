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
@Entity @Table(name= "tesis")
public class Tesis implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_tesis", length=10)
    private Long idtesis;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String paginas;
    @Column(length = 30)
      private String edicion;
    
     public Tesis(){
        this.idtesis= 0L;
    }

    public Long getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Long idtesis) {
        this.idtesis = idtesis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

   

   
     
     
}//final
