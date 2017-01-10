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
import utng.modelo.Tesis;

/**
 *
 * @author Maribel Medina Correa
 */
@ManagedBean (name="tesisBean") @SessionScoped
public class TesisBean implements Serializable {
    
    private List<Tesis> tesiss;
    private Tesis tesis;
    
    
    public TesisBean(){
    tesis=new Tesis();
    
    }

    public TesisBean(List<Tesis> tesiss, Tesis tesis) {
        this.tesiss = tesiss;
        this.tesis = tesis;
    }

    public List<Tesis> getTesiss() {
        return tesiss;
    }

    public void setTesiss(List<Tesis> tesiss) {
        this.tesiss = tesiss;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

   


    
    

     public String listar(){
        TesisDAO dao =new TesisDAO();
        try{
            tesiss=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Tesiss";
    }
      public String eliminar(){
        TesisDAO dao = new TesisDAO();
        try{
            dao.delete(tesis);
           tesiss = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        tesis = new Tesis();
        return "Iniciar";
        
         }
    public String guardar(){
        TesisDAO dao = new TesisDAO();
        try{
            if(tesis.getIdtesis()!=0){
                dao.update(tesis);
            }else{
                dao.insert(tesis);
            }
            tesiss = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Tesis tesis){
        this.tesis = tesis;
        return "Editar";
            }
}//final
