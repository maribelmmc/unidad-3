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
import utng.modelo.Medicamento;

/**
 *
 * @author Maribel Medina Correa
 */
@ManagedBean (name="medicamentoBean") @SessionScoped
public class MedicamentoBean implements Serializable {
    
    private List<Medicamento> medicamentos;
    private Medicamento medicamento;
    
    
    public MedicamentoBean(){
    medicamento=new Medicamento();
    
    }

    public MedicamentoBean(List<Medicamento> medicamentos, Medicamento medicamento) {
        this.medicamentos = medicamentos;
        this.medicamento = medicamento;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    
  

   


    
    

     public String listar(){
        MedicamentoDAO dao =new MedicamentoDAO();
        try{
            medicamentos=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Medicamentos";
    }
      public String eliminar(){
        MedicamentoDAO dao = new MedicamentoDAO();
        try{
            dao.delete(medicamento);
           medicamentos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        medicamento = new Medicamento();
        return "Iniciar";
        
         }
    public String guardar(){
        MedicamentoDAO dao = new MedicamentoDAO();
        try{
            if(medicamento.getIdMedicamento()!=0){
                dao.update(medicamento);
            }else{
                dao.insert(medicamento);
            }
            medicamentos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Medicamento medicamento){
        this.medicamento = medicamento;
        return "Editar";
            }
}//final
