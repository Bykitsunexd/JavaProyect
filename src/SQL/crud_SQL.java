package SQL;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class crud_SQL {
    
    conexion_SQL con=new conexion_SQL();
    
    public void insertar(String nombre, String apellido, String puesto){
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "insert into empleados(nombre, apellido,  puesto) values('"+nombre+"', '"+apellido+"', '"+puesto+"');";
            st.execute(sql);
            st.close();
            conexion.close(); 
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);  
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al guardar "+e,"error",JOptionPane.ERROR_MESSAGE);  
        }
    }
    
}
