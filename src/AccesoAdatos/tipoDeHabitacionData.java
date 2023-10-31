

package AccesoAdatos;

import Entidades.tipodehabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 */
public class tipoDeHabitacionData {

    
    private Connection con=null;
    
    public tipoDeHabitacionData(){
        con=Conexion.getConnection();
    }
    
    
public ArrayList<tipodehabitacion> todoslostipos(){
    
    ArrayList<tipodehabitacion> listado=new ArrayList<>();
    String sql="SELECT * from tipodehabitacion";
    try{
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            tipodehabitacion tipo=new tipodehabitacion();
            tipo.setCodigo(rs.getInt(1));
            tipo.setTipo(rs.getString(2));
            tipo.setCapacidad(rs.getInt(3));
            tipo.setCantcamas(rs.getInt(4));
            tipo.setTipocamas(rs.getString(5));
            tipo.setPrecio(rs.getDouble(6));
            listado.add(tipo);
            }
                   
        return listado;
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error conectando a la BD");
        return null;
    }
}
    public void modificarPrecios(tipodehabitacion tipodeH){
        
        String sql="UPDATE tipodehabitacion SET precio=? WHERE Codigo=?";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1,tipodeH.getPrecio());
            ps.setInt(2,tipodeH.getCodigo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cambios realizados con éxito");
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al intentar modificar precios");
        }
        
    }
    
    
 public tipodehabitacion BuscarporCodigo(int codigo){
 String sql="SELECT * FROM tipodehabitacion WHERE Codigo=?";
 tipodehabitacion tipoH=new tipodehabitacion();
 try{
     PreparedStatement ps=con.prepareStatement(sql);
     ps.setInt(1, codigo);
     ResultSet rs=ps.executeQuery();
     while (rs.next()){
         
         tipoH.setCodigo(codigo);
         tipoH.setTipo(rs.getString(2));
         tipoH.setCapacidad(rs.getInt(3));
         tipoH.setCantcamas(rs.getInt(4));
         tipoH.setTipocamas(rs.getString(5));
         tipoH.setPrecio(rs.getDouble(6));
     }
         
         
     }catch (SQLException ex){
         JOptionPane.showMessageDialog(null,"Error buscando tipos de habitacion");
     
 }
 return tipoH;
 
 }
     
    
}
