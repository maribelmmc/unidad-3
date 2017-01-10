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
@Entity @Table(name= "medicamento")
public class Medicamento implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_medicamento", length=10)
    private Long idMedicamento;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String tipo;
    @Column(length = 30)
      private String cantidad;
    
     public Medicamento(){
        this.idMedicamento= 0L;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }



   

   
     
     
}//final
