

package AccesoAdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**

 */
public class Conexion {

//    public static final String URL = "jdbc:mariadb://us-phx-web776.main-hosting.eu:3306/u351249038_elgranhotel";
//    public static final String USER = "u351249038_CRUD2023";
//    public static final String PASS = "*@gLGC6/Sd";
    
    public static final String URL = "jdbc:mysql://localhost:3306/bdelgranhotel";
    public static final String USER = "root";
    public static final String PASS = "";
    public Connection con=null;
    
    PreparedStatement ps;
    ResultSet rs;
    
   public static Connection getConnection(){
       
        Connection conexion=null;
        try{
            
            Class.forName("org.mariadb.jdbc.Driver"); //"org.mariadb.jdbc.Drivercom.mysql.jdbc.Driver"
            conexion = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    //show VARIABLES WHERE variable_name IN ("hostname","port");
                //JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        
        }catch(ClassNotFoundException | SQLException ex){
           JOptionPane.showMessageDialog(null, "Error getConnection");
        }
        return conexion;
    }
}
