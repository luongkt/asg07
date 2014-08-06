/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg07;


/**
 *
 * @author Luong
 */
public interface Item {
   public Item clone();

   @Override
   public String toString();
   public boolean equals(Item otherItem);
   
}
