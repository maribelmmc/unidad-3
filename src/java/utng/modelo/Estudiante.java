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
@Table(name = "estudiante")
public class Estudiante implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_estudiante")
    private Long idEstudiante;
    @Column(name = "nombre_estudiante", length = 10)
    private String nombreEstudiante;
    @Column(length = 15)
     private String apellido;
   @Column(length = 15)
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_tesis")
    private Tesis tesis;

    public Estudiante() {
        this.idEstudiante=0L;
    }


    public Estudiante(Long idEstudiante, String nombreEstudiante, String apellido, String telefono, Tesis chef) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tesis = tesis;
    }

  
    
    
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    

    
     
}//final
