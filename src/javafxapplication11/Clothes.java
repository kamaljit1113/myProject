    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

/**
 *
 * @author navjot
 */
public class Clothes {
    public static String message = ""; 
    private String name,size;
    private int quanity;
    private int price;

    public Clothes(String name, String size, int quanity, int price) {
        this.name = name;
        this.size = size;
        this.quanity = quanity;
        this.price = price;
    }

    public Clothes() {
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        Clothes.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int calculateAmountPerItem(){
        return getPrice()*getQuanity();
    }

    @Override
    public String toString() {
        return "Clothes:" + "name=" + name + ", size=" + size + ", Total Price= "+calculateAmountPerItem();
    }
   
    
}
