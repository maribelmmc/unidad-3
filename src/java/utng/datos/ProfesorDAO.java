/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Profesor;


/**
 *
 * @author Maribel
 */
public class ProfesorDAO extends DAO<Profesor>{
    public ProfesorDAO(){
        super(new Profesor());
       
    }
    
    public Profesor getOneById(Profesor profesor)
            throws HibernateException{
        return super.getOneById(profesor.getIdProfesor());
    }
     
}//final
