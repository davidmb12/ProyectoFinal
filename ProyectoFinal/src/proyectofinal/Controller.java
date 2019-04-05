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
    public Controller(){
        
    }
     public ArrayList usuLogin(ArrayList usuariosContras) {
        try {
            leerTxt nuevo = new leerTxt();
            usuariosContras = nuevo.leer();
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuariosContras;
    }
     
     public void popUp(String infoMensaje, String title){
         JOptionPane.showMessageDialog(null,infoMensaje, title,JOptionPane.INFORMATION_MESSAGE);
     }
     public String onClickButtonLogin(ArrayList usuariosContras,String user, String passWord){
           boolean listo = true;
        boolean usu = false;
        
        String mensaje = "";
        if (usuariosContras.contains(user)) {
            for (int i = 0; i < usuariosContras.size(); i++) {
                if (passWord.equals(usuariosContras.get(i))) {
                    JOptionPane panel=new JOptionPane();
                    mensaje = ("Bienvenido");
                    
                    break;
                } else {
                    mensaje = ("Contrase;a invalida");

                }

            }
        } else {
            System.out.println("Usuario invalido");
        }
            popUp(mensaje,"");
            return mensaje;
     }
}
