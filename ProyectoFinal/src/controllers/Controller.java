/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.login;

/**
 *
 * @author e009474
 */
public class Controller {

    public Controller() {

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

    public void popUp(String infoMensaje, String title) {
        JOptionPane.showMessageDialog(null, infoMensaje, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean onClickButtonLogin(ArrayList usuariosContras, String user, String passWord) {
      

        boolean listo = true;
        boolean usu = false;
        boolean log = false;
        String mensaje;
        int a=0;
        
        return log;
    }
}
