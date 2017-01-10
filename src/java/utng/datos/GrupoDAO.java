/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Grupo;
import utng.modelo.Tesis;

/**
 *
 * @author Maribel
 */
public class GrupoDAO extends DAO<Grupo>{
    public GrupoDAO(){
        super(new Grupo());
    }
     public Grupo getOneById(Grupo grupo)
            throws HibernateException{
        return super.getOneById(grupo.getIdgrupo());
    }
}//final
