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
import utng.datos.TesisDAO;
import utng.modelo.Grupo;
import utng.modelo.Tesis;

/**
 *
 * @author Maribel Medina Correa
 */
@ManagedBean (name="grupoBean") @SessionScoped
public class GrupoBean implements Serializable {
    
    private List<Grupo> grupos;
    private Grupo grupo;
    
    
    public GrupoBean(){
    grupo=new Grupo();
    
    }

    public GrupoBean(List<Grupo> grupos, Grupo grupo) {
        this.grupos = grupos;
        this.grupo = grupo;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    



   


    
    

     public String listar(){
        GrupoDAO dao =new GrupoDAO();
        try{
            grupos=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Grupos";
    }
      public String eliminar(){
        GrupoDAO dao = new GrupoDAO();
        try{
            dao.delete(grupo);
           grupos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        grupo= new Grupo();
        return "Iniciar";
        
         }
    public String guardar(){
        GrupoDAO dao = new GrupoDAO();
        try{
            if(grupo.getIdgrupo()!=0){
                dao.update(grupo);
            }else{
                dao.insert(grupo);
            }
            grupos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Grupo grupo){
        this.grupo = grupo;
        return "Editar";
            }
}//final
