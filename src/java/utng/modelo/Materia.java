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
@Entity @Table(name= "materia")
public class Materia implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_materia", length=10)
    private Long idmateria;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String unidades;
    @Column(length = 30)
      private String horas;
    
     public Materia(){
        this.idmateria= 0L;
    }

    public Long getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Long idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    

   

   
     
     
}//final
