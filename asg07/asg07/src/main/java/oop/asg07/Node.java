/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg07;

/**
 *
 * @author Luong
 */
public class Node {
     
        Item data;
        Node next; //refers to the next item in the list
        Node (Item _data,Node _next) { 
          next = _next;
          data = _data.clone();
  
      //  this.data = (Item) data.clone(); // deep copy 
        
       }

    

}
