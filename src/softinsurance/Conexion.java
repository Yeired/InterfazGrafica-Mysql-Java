package softinsurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import javax.swing.JOptionPane;
public class Conexion 
{
    Connection con;
    Statement sen;
    ResultSet res;
    String bd="softinsurance";
    public Connection conectar()
    {        
        //String sFichero = "conecxml.xml";
        String sFichero = "conecjson.txt";
        String servidor="", usuario="", passwd="", port="";
        File fichero = new File(sFichero);
        //generaxml xml = new generaxml();
        ConexionJson gjson = new ConexionJson();
        if (fichero.exists())
        {
            try {
                String[] retorna = new String[5];
                retorna = gjson.leejson();
                servidor=retorna[0];
                usuario=retorna[1];
                passwd=retorna[2];
                port=retorna[3];
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //String cadconexion ="jdbc:mysql://"+ servidor +":" + port + "?&useSSL=false&user="+ usuario +"&password="+ passwd;
            //System.out.println(cadconexion);
            //con = DriverManager.getConnection(cadconexion);
            String cadconexion ="jdbc:mysql://"+ servidor +":" + port + "/";
            System.out.println(cadconexion);
            con=DriverManager.getConnection("jdbc:mysql://"+ servidor +":" + port + "/" + bd , usuario , passwd);
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyecto","root","12345678");
            sen = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e);
        }
        return con;
    }
    
public void DesconectarBasedeDatos() {
        try {
            if (con != null) {
                if (sen != null) {
                    sen.close();
                }
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return con;
    }
}