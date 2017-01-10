/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Tesis;

/**
 *
 * @author Maribel
 */
public class TesisDAO extends DAO<Tesis>{
    public TesisDAO(){
        super(new Tesis());
    }
     public Tesis getOneById(Tesis tesis)
            throws HibernateException{
        return super.getOneById(tesis.getIdtesis());
    }
}//final
