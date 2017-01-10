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
import utng.datos.MedicamentoDAO;
import utng.datos.RecetaDAO;


import utng.modelo.Medicamento;
import utng.modelo.Receta;


/**
 *
 * @author maribel medina
 */
@ManagedBean(name = "recetaBean")@SessionScoped
public class RecetaBean implements Serializable{
    private List<Receta> recetas;
    private Receta receta;
    private List<Medicamento> medicamentos;
    
    public RecetaBean(){
        receta = new Receta();
        receta.setMedicamento(new Medicamento());
    } 

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

  

    

   
     public String listar(){
        RecetaDAO dao = new RecetaDAO();
        try{
            recetas= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Recetas";
        }
     public String eliminar(){
        RecetaDAO dao = new RecetaDAO();
        try{
            dao.delete(receta);
            recetas = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       receta= new Receta();
       receta.setMedicamento(new Medicamento());
       try{
           medicamentos = new MedicamentoDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        RecetaDAO dao = new RecetaDAO();
        try{ 
            if(receta.getIdReceta()!=0){
                dao.update(receta);
        }else{ dao.insert(receta);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        recetas = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Receta receta){
        this.receta = receta;
        try{
           medicamentos = new MedicamentoDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
