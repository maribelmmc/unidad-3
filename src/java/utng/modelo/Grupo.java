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
@Entity @Table(name= "grupo")
public class Grupo implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_grupo", length=10)
    private Long idgrupo;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String numalum;
    @Column(length = 30)
      private String carrera;
    
     public Grupo(){
        this.idgrupo= 0L;
    }

    public Long getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumalum() {
        return numalum;
    }

    public void setNumalum(String numalum) {
        this.numalum = numalum;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    

   

   
     
     
}//final
