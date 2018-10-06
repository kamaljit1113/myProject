/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author navjot
 */
public class CLOTHESController implements Initializable {

    /**
     * Initializes the controller class.
     */ 
    @FXML
    private ComboBox c1;
    @FXML
    private ComboBox c2;
    @FXML
    private ComboBox c3;
    @FXML
    private ComboBox c4;
    @FXML
    private ComboBox c5;
    @FXML
    private ComboBox c6;
    @FXML
    private CheckBox ch_swatShirt;
    @FXML
    private CheckBox ch_hoodie;
    @FXML
    private CheckBox ch_sweater;
    @FXML
    private CheckBox ch_jeans;
    @FXML
    private CheckBox ch_pant;
    @FXML
    private CheckBox ch_goggles;
    @FXML
    private RadioButton s1;
    @FXML
    private RadioButton s2;
    @FXML
    private RadioButton s3;
    @FXML
    private RadioButton s4;
    @FXML
    private RadioButton s5;
    @FXML
    private RadioButton s6;
    @FXML
    private RadioButton m1;
    @FXML
    private RadioButton m2;
    @FXML
    private RadioButton m3;
    @FXML
    private RadioButton m4;
    @FXML
    private RadioButton m5;
    @FXML
    private RadioButton m6;
    @FXML
    private RadioButton l1;
    @FXML
    private RadioButton l2;
    @FXML
    private RadioButton l3;
    @FXML
    private RadioButton l4;
    @FXML
    private RadioButton l5;
    @FXML
    private RadioButton l6;
    @FXML
    private RadioButton xl1;
    @FXML
    private RadioButton xl2;
    @FXML
    private RadioButton xl3;
    @FXML
    private RadioButton xl4;
    @FXML
    private RadioButton xl5;
    @FXML
    private RadioButton xl6;
    @FXML
            private Button b1;
    Order order=new Order();
 Clothes cl= new Clothes();
 Clothes cl2= new Clothes(); 
    Clothes cl3= new Clothes();
Clothes cl4= new Clothes();
Clothes cl5= new Clothes();
Clothes cl6= new Clothes();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
          c1.getItems().addAll("1","2","3","4","5","6","7","8","9");
           c2.getItems().addAll("1","2","3","4","5","6","7","8","9");
           c3.getItems().addAll("1","2","3","4","5","6","7","8","9");
           c4.getItems().addAll("1","2","3","4","5","6","7","8","9");
           c5.getItems().addAll("1","2","3","4","5","6","7","8","9");
           c6.getItems().addAll("1","2","3","4","5","6","7","8","9");
           
    }    
    
 @FXML
 private void swatShirtCart(ActionEvent event){
  if (ch_swatShirt.isSelected()) {
       // add name,quantity,size and price to array list 
        cl.setName("Swat Shirt");
        cl.setPrice(25);
       
     }
  order.ar_clothe.add(cl);
 }
  @FXML
 private void swatShirtSize(ActionEvent event){

     if(s1.isSelected()){
         cl.setSize("Small");
     }else if (m1.isSelected()) {
         cl.setSize("Medium");
     }else if (l1.isSelected()) {
         cl.setSize("Large");
     }else if (xl1.isSelected()) {
         cl.setSize("X-Large");
     }
 
 }
  @FXML
 private void swatShirtQty(ActionEvent event){
  cl.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));

 }
 
 @FXML
  private void hoodieCart(ActionEvent event){
         if (ch_hoodie.isSelected()) {
         // add name,quantity,size and price to array list 
        cl2.setName("Hoodie");
        cl2.setPrice(75);
        
     }
     order.ar_clothe.add(cl2);
 }
  
   @FXML
  private void hoodieQty(ActionEvent event){
   cl2.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));
  }
  
   @FXML
  private void hoodieSize(ActionEvent event){
     if(s2.isSelected()){
         cl2.setSize("Small");
     }else if (m2.isSelected()) {
         cl2.setSize("Medium");
     }else if (l2.isSelected()) {
         cl2.setSize("Large");
     }else if (xl2.isSelected()) {
         cl2.setSize("X-Large");
     }
    
 }
 
 @FXML
 private void sweaterQty(ActionEvent event){
  cl3.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));

 }
 
  @FXML
 private void sweaterCart(ActionEvent event){
 if (ch_sweater.isSelected()) {
         // add name,quantity,size and price to array list 
        cl3.setName("sweater");
        cl3.setPrice(50);
     }

     order.ar_clothe.add(cl3);
 }
  @FXML
 private void sweaterSize(ActionEvent event){

     if(s3.isSelected()){
         cl3.setSize("Small");
     }else if (m3.isSelected()) {
         cl3.setSize("Medium");
     }else if (l3.isSelected()) {
         cl3.setSize("Large");
     }else if (xl3.isSelected()) {
         cl3.setSize("X-Large");
     }
 
 }
 @FXML
 private void jeansCart(ActionEvent event){
     
     if (ch_goggles.isSelected()) {
         // add name,quantity,size and price to array list 
        cl4.setName("jeans");
        cl4.setPrice(50);
    }
     order.ar_clothe.add(cl4);
 }
 
  @FXML
 private void jeansQty(ActionEvent event){

        cl4.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));

 }
 
  @FXML
 private void jeansSize(ActionEvent event){

     if(s4.isSelected()){
         cl4.setSize("Small");
     }else if (m4.isSelected()) {
         cl4.setSize("Medium");
     }else if (l4.isSelected()) {
         cl4.setSize("Large");
     }else if (xl4.isSelected()) {
         cl4.setSize("X-Large");
     }
   
 }

 @FXML
 private void PantsCart(ActionEvent event){

     if (ch_pant.isSelected()) {
         // add name,quantity,size and price to array list 
        cl5.setName("pant");
        cl5.setPrice(50);
    }
     order.ar_clothe.add(cl5);
 }
 
  @FXML
 private void PantsQty(ActionEvent event){

        cl5.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));

 }
 
  @FXML
 private void PantsSize(ActionEvent event){
     
     if(s5.isSelected()){
         cl5.setSize("Small");
     }else if (m5.isSelected()) {
         cl5.setSize("Medium");
     }else if (l5.isSelected()) {
         cl5.setSize("Large");
     }else if (xl5.isSelected()) {
         cl5.setSize("X-Large");
     }
  
 }
 @FXML
 private void GogglesCart(ActionEvent event){

     if (ch_goggles.isSelected()) {
         // add name,quantity,size and price to array list 
        cl6.setName("goggles");
        cl6.setPrice(50);

     }
     order.ar_clothe.add(cl6);
   
 }
 
 
  @FXML
 private void GogglesQty(ActionEvent event){

  cl6.setQuanity(Integer.parseInt( c1.getSelectionModel().getSelectedItem().toString()));
 
   
 }
  @FXML
 private void GogglesSize(ActionEvent event){

     if(s6.isSelected()){
         cl6.setSize("Small");
     }else if (m6.isSelected()) {
         cl6.setSize("Medium");
     }else if (l6.isSelected()) {
         cl6.setSize("Large");
     }else if (xl6.isSelected()) {
         cl6.setSize("X-Large");
     }
 
   
 }
 
 @FXML
 public void btn_b1(ActionEvent event){
     order.printClothe();
 }
 
    
    
}
