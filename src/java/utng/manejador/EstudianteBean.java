/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.TesisDAO;
import utng.datos.EstudianteDAO;
import utng.modelo.Tesis;
import utng.modelo.Estudiante;


/**
 *
 * @author Maribel
 */
@ManagedBean(name = "estudianteBean")@SessionScoped
public class EstudianteBean implements Serializable{
    private List<Estudiante> estudiantes;
    private Estudiante estudiante;
    private List<Tesis> tesiss;
    
    public EstudianteBean(){
        estudiante = new Estudiante();
        estudiante.setTesis(new Tesis());
    } 

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Tesis> getTesiss() {
        return tesiss;
    }

    public void setTesiss(List<Tesis> tesiss) {
        this.tesiss = tesiss;
    }

    

   
     public String listar(){
        EstudianteDAO dao = new EstudianteDAO();
        try{
            estudiantes= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Estudiantes";
        }
     public String eliminar(){
        EstudianteDAO dao = new EstudianteDAO();
        try{
            dao.delete(estudiante);
            estudiantes = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       estudiante= new Estudiante();
       estudiante.setTesis(new Tesis());
       try{
           tesiss = new TesisDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        EstudianteDAO dao = new EstudianteDAO();
        try{ 
            if(estudiante.getIdEstudiante()!=0){
                dao.update(estudiante);
        }else{ dao.insert(estudiante);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        estudiantes = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Estudiante estudiante){
        this.estudiante = estudiante;
        try{
           tesiss = new TesisDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
