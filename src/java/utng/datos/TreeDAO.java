/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Tree;



/**
 *
 * @author maribel medina
 */
public class TreeDAO extends DAO<Tree>{
    public TreeDAO(){
        super(new Tree());
       
    }
    
    public Tree getOneById(Tree tree)
            throws HibernateException{
        return super.getOneById(tree.getIdTree());
    }
     
}//final
