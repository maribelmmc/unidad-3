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
@Table(name = "profesor")
public class Profesor implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_profesor")
    private Long idProfesor;
    @Column(name = "nombre_profesor", length = 10)
    private String nombreProfesor;
    @Column(length = 15)
     private String apellido;
   @Column(length = 15)
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private Grupo grupo;
    @ManyToOne
     @JoinColumn(name = "id_materia")
    private Materia materia;

    public Profesor() {
        this.idProfesor=0L;
    }

    public Profesor(Long idProfesor, String nombreProfesor, String apellido, String telefono, Grupo grupo, Materia materia) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellido = apellido;
        this.telefono = telefono;
        this.grupo = grupo;
        this.materia = materia;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

   


    

    
     
}//final
