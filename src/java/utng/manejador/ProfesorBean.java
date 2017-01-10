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
import utng.datos.GrupoDAO;
import utng.datos.MateriaDAO;
import utng.datos.ProfesorDAO;
import utng.modelo.Grupo;
import utng.modelo.Materia;
import utng.modelo.Profesor;




/**
 *
 * @author maribel
 */
@ManagedBean(name = "profesorBean")@SessionScoped
public class ProfesorBean implements Serializable{
    private List<Profesor> profesores;
    private Profesor profesor;
    private List<Grupo> grupos;
    private List<Materia> materias;
    public ProfesorBean(){
        profesor = new Profesor();
        profesor.setGrupo(new Grupo());
        profesor.setMateria(new Materia());
    } 

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

   

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

   

   
    

    

   
     public String listar(){
        ProfesorDAO dao = new ProfesorDAO();
        try{
            profesores= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Profesores";
        }
     public String eliminar(){
        ProfesorDAO dao = new ProfesorDAO();
        try{
            dao.delete(profesor);
            profesores = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       profesor= new Profesor();
       profesor.setGrupo(new Grupo());
       profesor.setMateria(new Materia());
       try{
           grupos = new GrupoDAO().getAll();
           materias=new MateriaDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        ProfesorDAO dao = new ProfesorDAO();
        try{ 
            if(profesor.getIdProfesor()!=0){
                dao.update(profesor);
        }else{ dao.insert(profesor);}
           
        }catch(Exception e){e.printStackTrace();
        } 
       profesores = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Profesor profesor){
        this.profesor = profesor;
        try{
           materias = new MateriaDAO().getAll();
           grupos=new GrupoDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
