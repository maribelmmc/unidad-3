/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.NameSource;


/**
 *
 * @author Maribel
 */
public class NameSourceDAO extends DAO<NameSource>{
    public NameSourceDAO(){
        super(new NameSource());
    }
     public NameSource getOneById(NameSource source)
            throws HibernateException{
        return super.getOneById(source.getIdSource());
    }
}//final
