/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author e009474
 */
public class Controller {
    public Controller() throws IOException{
        this.leer = new leerTxt();
        
    }
    leerTxt leer;
    
     public void popUp(String infoMensaje, String title){
         JOptionPane.showMessageDialog(null,infoMensaje, title,JOptionPane.INFORMATION_MESSAGE);
     }
     public boolean onClickButtonLogin(String user, String passWord) throws IOException{
        
            return leer.leer(user,passWord);
        
        
     }
}
