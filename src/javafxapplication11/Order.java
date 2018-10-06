/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import java.util.ArrayList;

/**
 *
 * @author navjot
 */
public class Order {
    ArrayList<Clothes> ar_clothe= new ArrayList();
   
 public void printClothe(){
     for (int i = 0; i < ar_clothe.size(); i++) {
         System.out.println("");
         System.out.println(ar_clothe.get(i).toString());
         System.out.println("");
     }
 }
    
    
}
