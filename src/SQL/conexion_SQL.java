/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author fredd
 */
public class conexion_SQL {
    Connection con = null;
    
    String url = "jdbc:postgresql://localhost/Empresa";
    String usuario = "postgres";
    String clave = "admin";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectar "+e,"error",JOptionPane.ERROR_MESSAGE);  
        }
        return  con;
    }
    
}
