/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Estudiante;

/**
 *
 * @author Maribel Medina
 */
public class EstudianteDAO extends DAO<Estudiante>{
    public EstudianteDAO(){
        super(new Estudiante());
       
    }
    
    public Estudiante getOneById(Estudiante estudiante)
            throws HibernateException{
        return super.getOneById(estudiante.getIdEstudiante());
    }
     
}//final
