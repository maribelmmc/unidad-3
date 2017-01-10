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
import utng.datos.NameSourceDAO;
import utng.datos.TreeDAO;
import utng.modelo.NameSource;
import utng.modelo.Tree;


/**
 *
 * @author maribel medina
 */
@ManagedBean(name = "treeBean")@SessionScoped
public class TreeBean implements Serializable{
    private List<Tree> trees;
    private Tree tree;
    private List<NameSource> sources;
    
    public TreeBean(){
        tree = new Tree();
        tree.setSource(new NameSource());
    } 

    public TreeBean(List<Tree> trees, Tree tree, List<NameSource> sources) {
        this.trees = trees;
        this.tree = tree;
        this.sources = sources;
    }

    
    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public List<NameSource> getSources() {
        return sources;
    }

    public void setSources(List<NameSource> sources) {
        this.sources = sources;
    }

   

  

    

   
     public String listar(){
        TreeDAO dao = new TreeDAO();
        try{
            trees= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Trees";
        }
     public String eliminar(){
        TreeDAO dao = new TreeDAO();
        try{
            dao.delete(tree);
            trees = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       tree= new Tree();
       tree.setSource(new NameSource());
       try{
           sources = new NameSourceDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        TreeDAO dao = new TreeDAO();
        try{ 
            if(tree.getIdTree()!=0){
                dao.update(tree);
        }else{ dao.insert(tree);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        trees = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Tree tree){
        this.tree = tree;
        try{
           sources = new NameSourceDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
