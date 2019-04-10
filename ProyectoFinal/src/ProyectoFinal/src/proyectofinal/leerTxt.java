/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author e009474
 */
public class leerTxt {

    private String ruta = "C:\\Users\\Davit\\Desktop\\Development\\txtsEclipse\\input.txt";

    public leerTxt() throws IOException {
    }

    public boolean StringToArray(String linea,String usu,String pass) {
        ArrayList<String> arrayUsu = new ArrayList<String>();
        ArrayList<String> arrayCont = new ArrayList<String>();
        String mensaje="";
        StringTokenizer st = new StringTokenizer(linea, ",");
        boolean log=false;
        int cont=0;
        while (st.hasMoreTokens()) {
            if(cont%2==0){
             arrayUsu.add(String.valueOf(st.nextToken()));

            }else{
             arrayCont.add(String.valueOf(st.nextToken()));


            }
            cont++;
        }
        
        
        for (int i = 0; i <arrayUsu.size(); i++) {
            if(log==true){
                break;
            }
            if(arrayUsu.get(i).equals(usu) ){
                System.out.println("si");
                        System.out.println(arrayUsu.get(i));

            for(int j=0;j<arrayCont.size();j++){
                if(arrayCont.get(j).equals(pass)&& j==i){
                  System.out.println(arrayCont.get(i));

                    mensaje="Bienvenido "+ usu;
                    
                    log=true;
                    break;
            }else{
                    mensaje="Contrase;a invalida";
                    log=false;
                }
            }
        }else{
                mensaje="Usuario invalido";
            }
        }
        popUp(mensaje,"");

        return log;
    }
    public void popUp(String infoMensaje, String title){
         JOptionPane.showMessageDialog(null,infoMensaje, title,JOptionPane.INFORMATION_MESSAGE);
     }

    public boolean leer(String usu, String pass) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String lineaNueva = "";
        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                lineaNueva += "," + linea;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
        lineaNueva = lineaNueva.replaceFirst(",", "");
        System.out.println(lineaNueva);

        return StringToArray(lineaNueva,usu,pass);

    }
}
