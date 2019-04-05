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

/**
 *
 * @author e009474
 */
public class leerTxt {

    private String ruta = "C:\\Users\\e009474\\Desktop\\usuConts.txt";

    public leerTxt() throws IOException {
    }

    public ArrayList StringToArray(String linea) {
        ArrayList<String> array = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(linea, ",");
        while (st.hasMoreTokens()) {
            array.add(String.valueOf(st.nextToken()));

        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        return array;
    }

    public ArrayList leer() throws FileNotFoundException, IOException {
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

        return StringToArray(lineaNueva);

    }
}
