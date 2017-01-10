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
import utng.datos.NameSourceDAO;
import utng.modelo.NameSource;

/**
 *
 * @author Maribel Medina Correa
 */
@ManagedBean (name="nameSourceBean") @SessionScoped
public class NameSourceBean implements Serializable {
    
    private List<NameSource> sources;
    private NameSource source;
    
    
    public NameSourceBean(){
    source=new NameSource();
    
    }

    public NameSourceBean(List<NameSource> sources, NameSource source) {
        this.sources = sources;
        this.source = source;
    }

    public List<NameSource> getSources() {
        return sources;
    }

    public void setSources(List<NameSource> sources) {
        this.sources = sources;
    }

    public NameSource getSource() {
        return source;
    }

    public void setSource(NameSource source) {
        this.source = source;
    }

    

   

    
  

   


    
    

     public String listar(){
        NameSourceDAO dao =new NameSourceDAO();
        try{
            sources=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Sources";
    }
      public String eliminar(){
        NameSourceDAO dao = new NameSourceDAO();
        try{
            dao.delete(source);
           sources = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        source = new NameSource();
        return "Iniciar";
        
         }
    public String guardar(){
        NameSourceDAO dao = new NameSourceDAO();
        try{
            if(source.getIdSource()!=0){
                dao.update(source);
            }else{
                dao.insert(source);
            }
            sources = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(NameSource source){
        this.source = source;
        return "Editar";
            }
}//final
