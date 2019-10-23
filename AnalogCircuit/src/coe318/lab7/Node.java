/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author h36grewa
 */
public class Node {
    
        public int id; // Id number of current node
    public static int id_next=0; // Id value of next node
    
    public Node()
    {
        this.id= id_next;
        id_next++;     
    }
    
    public String toString(){
        return " " + this.id;
    }
    
}
