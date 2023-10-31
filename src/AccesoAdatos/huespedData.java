

package AccesoAdatos;

import Entidades.huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 */
public class huespedData {

    private Connection con =null;
    PreparedStatement ps;
    ResultSet rs;

    public huespedData (){
        
        con=Conexion.getConnection();
        
        System.out.println("conexion creada");
         }

    public void guardarHuesped (huesped huespedA){
      
    try {
            String sql ="INSERT  INTO `huesped` ( `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES(?,?,?,?,?,?)" ;
            ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huespedA.getDni());
            ps.setString(2, huespedA.getApellidoynom());
            ps.setString(3, huespedA.getDireccion());
            ps.setString(4, huespedA.getCorreo());
            ps.setString(5, huespedA.getCelular());
            ps.setBoolean(6, huespedA.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                huespedA.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped Guardado correctamente");
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error guardar huesped "+ex);
          

        }

    }
    
    public void listarhuespedes(){
        String sql="SELECT * FROM huesped";
        try {
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("id:"+rs.getInt(1));
                System.out.println("DNI:"+rs.getInt(2));
                System.out.println("Apellido y nombre:"+rs.getString(3));
                System.out.println("Domicilio:"+rs.getString(4));
                System.out.println("Correo:"+rs.getString(5));
                System.out.println("Celular"+rs.getString(6));
                System.out.println("Estado:"+rs.getBoolean(7));
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error consultando BD");
        }
        
    }
     
    public void modificarhuesped(huesped hues){
        String sql="UPDATE huesped SET Dni=?, Apellidoynom=?, Direccion=?, Correo=?, Celular=?, Estado=? WHERE idHuesped=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, hues.getDni());
            ps.setString(2, hues.getApellidoynom());
            ps.setString(3, hues.getDireccion());
            ps.setString(4, hues.getCorreo());
            ps.setString(5, hues.getCelular());
            ps.setBoolean(6, hues.isEstado());
            ps.setInt(7, hues.getIdHuesped());
            
            ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Huesped modificado");
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error modificando huesped");
        }
 
    }

    public void eliminarhuesped(int idHuesped){
        String sql="UPDATE huesped SET estado=0 Where idHuesped=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.executeQuery();
    
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el huesped");
            
        }
    }
    public huesped buscarporDni(int Dni){
            
        try {
            huesped buscado= new huesped();
            String sql="SELECT * FROM huesped WHERE Dni =?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, Dni);
            ResultSet rs=ps.executeQuery();
             if (rs.next()) {
               
                buscado.setIdHuesped(rs.getInt("idHuesped"));
                buscado.setDni(rs.getInt("Dni"));
                buscado.setApellidoynom(rs.getString("Apellidoynom"));
                buscado.setDireccion(rs.getString("Direccion"));
                buscado.setCorreo(rs.getString("Correo"));
                buscado.setCelular(rs.getString("Celular"));
                buscado.setEstado(rs.getBoolean("Estado"));
                 ps.close();
                return buscado;
            
            }else {
            JOptionPane.showMessageDialog(null, "No existe ese huesped ");
            ps.close();
            return null;
             
            } 
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error buscando el huesped");
        }
         
        return null;    
       }  
    
     public huesped buscarporid(int idHuesped){
            huesped buscado= new huesped();
            String sql="SELECT * FROM huesped WHERE idHuesped =?";
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(0, idHuesped );
            ResultSet rs=ps.executeQuery();
             if (rs.next()) {
               
                buscado.setIdHuesped(idHuesped);
                buscado.setDni(rs.getInt("Dni"));
                buscado.setApellidoynom(rs.getString("Apellidoynom"));
                buscado.setDireccion(rs.getString("Direccion"));
                buscado.setCorreo(rs.getString("Correo"));
                buscado.setCelular(rs.getString("Celular"));
                buscado.setEstado(rs.getBoolean("Estado"));
                 ps.close();
  
            }else {
            JOptionPane.showMessageDialog(null, "No existe ese huesped ");
            ps.close();

            } 
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error buscando el huesped");
        }
         
        return buscado;   
       }  
/*
    public void guardarhuesped(huesped a){
        huesped nuevo= new huesped() ;
//        nuevo.setDni(Dni);
//        nuevo.setApellidoynom(Apellidoynom);
//        nuevo.setDireccion(Direccion);
//        nuevo.setCorreo(Correo);
//        nuevo.setCelular(Celular);
//        nuevo.setEstado(Estado);
//        System.out.println("nuevo huesped"+nuevo.toString());
//       }
        try {
            String sql ="INSERT  INTO `huesped` ( `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES(?,?,?,?,?,?)" ;
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellidoynom());
            ps.setString(3, a.getDireccion());
            ps.setString(4, a.getCorreo());
            ps.setString(5, a.getCelular());
            ps.setBoolean(6, a.isEstado());

            ResultSet rs=ps.executeQuery();
          
            
             
//            nuevo.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped Guardado correctamente");
            
            
        } 
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error guardar huesped "+ex);

        }
       }
*/
    public ArrayList<huesped>listarhuesped(){
            ArrayList<huesped>registrados =new ArrayList<>();
            String sql ="SELECT * FROM huesped";
           
             
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                huesped huesped=new huesped();
//                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("Dni"));
                huesped.setApellidoynom(rs.getString("Apellidoynom"));
                huesped.setDireccion(rs.getString("Direccion"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getString("Celular"));
//                huesped.setEstado(rs.getBoolean("Estado"));
                registrados.add(huesped);
                //SOUT DE PRUEBA
                  
            }
//             System.out.println(""+registrados);
             
           
            return registrados;
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en conexion a Base de Datos al listar huesped");
          
          return registrados;
        }
            
        } 

 
    
}
