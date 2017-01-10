/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Maribel Medina Correa
 */
@Entity
@Table(name = "tree")
public class Tree implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_tree")
    private Long idTree;
    @Column(name = "name_tree", length = 10)
    private String nameTree;
    @Column(length = 120)
     private String description;
  
    @ManyToOne
    @JoinColumn(name = "id_source")
    private NameSource source;

    public Tree() {
        this.idTree=0L;
    }

    public Tree(Long idTree, String nameTree, String description, NameSource source) {
        this.idTree = idTree;
        this.nameTree = nameTree;
        this.description = description;
        this.source = source;
    }

    public Long getIdTree() {
        return idTree;
    }

    public void setIdTree(Long idTree) {
        this.idTree = idTree;
    }

    public String getNameTree() {
        return nameTree;
    }

    public void setNameTree(String nameTree) {
        this.nameTree = nameTree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NameSource getSource() {
        return source;
    }

    public void setSource(NameSource source) {
        this.source = source;
    }

    


  
    
    
    
    

   

    

    
     
}//final
