package softinsurance;

import java.sql.Connection;
import java.io.BufferedReader;
import org.json.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class SoftInsurance {

    public static void main(String[] args){
        //BuscarBD BuscarBD= new BuscarBD();
        //BuscarBD.setVisible(true);
        //BuscarBD.setLocationRelativeTo(null); 
        File archivo = new File("conecjson.txt");
            // Si el archivo no existe es creado
        if (!archivo.exists()){
            ConexionJson ConexionJson= new ConexionJson();
            ConexionJson.setVisible(true);
            ConexionJson.setLocationRelativeTo(null);
            }
        else{
        NuevoJson NuevoJson= new NuevoJson();
        NuevoJson.setVisible(true);
        NuevoJson.setLocationRelativeTo(null); 
        }
        //archivo.createNewFile();
        //xGeneraJson GeneraJson= new GeneraJson();
        //GeneraJson.setVisible(true);
        //GeneraJson.setLocationRelativeTo(null);
        /*BuscarJSON buscarJSON= new BuscarJSON();
        buscarJSON.setVisible(true);
        buscarJSON.setLocationRelativeTo(null);*/
        
        
        
    }
}
