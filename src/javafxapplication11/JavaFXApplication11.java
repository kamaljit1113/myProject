/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author navjot   
 */
public class JavaFXApplication11 extends Application {
       // static CLOTHESController c1;
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root1= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("CLOTHES.fxml"));
//        FXMLLoader r1 = new FXMLLoader(getClass().getResource("CLOTHES.fxml"));
//        
//        Parent root1 = r1.load();
//        
//        c1= r1.getController();
//        
        Scene scene = new Scene(root);
      
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
