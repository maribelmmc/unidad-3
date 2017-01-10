/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Medicamento;


/**
 *
 * @author Maribel
 */
public class MedicamentoDAO extends DAO<Medicamento>{
    public MedicamentoDAO(){
        super(new Medicamento());
    }
     public Medicamento getOneById(Medicamento medicamento)
            throws HibernateException{
        return super.getOneById(medicamento.getIdMedicamento());
    }
}//final
