/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.Receta;

/**
 *
 * @author maribel medina
 */
public class RecetaDAO extends DAO<Receta>{
    public RecetaDAO(){
        super(new Receta());
       
    }
    
    public Receta getOneById(Receta receta)
            throws HibernateException{
        return super.getOneById(receta.getIdReceta());
    }
     
}//final
