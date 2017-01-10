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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Maribel Medina Correa
 */
@Entity
@Table(name = "receta")
public class Receta implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_receta")
    private Long idReceta;
    @Column(name = "nombre_paciente", length = 10)
    private String nombrepaciente;
    @Column(length = 15)
     private String edadPaciente;
   @Column(length = 15)
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento medicamento;

    public Receta() {
        this.idReceta=0L;
    }

    public Receta(Long idReceta, String nombrepaciente, String edadPaciente, String fecha, Medicamento medicamento) {
        this.idReceta = idReceta;
        this.nombrepaciente = nombrepaciente;
        this.edadPaciente = edadPaciente;
        this.fecha = fecha;
        this.medicamento = medicamento;
    }

    public Long getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public String getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }


   

  
    
    
    
    

   

    

    
     
}//final
