

package AccesoAdatos;

import Entidades.habitacion;
import Entidades.tipodehabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 */
public class tipoDeHabitacionData {
    private Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    
    public tipoDeHabitacionData(){
        con=Conexion.getConnection();
    }
    
     public void guardarTipoHabitacion(tipodehabitacion tipo){
       
        String sql="INSERT INTO tipodehabitacion (Codigo, Tipo, Capacidad, Cantidadcamas,Tipocamas,Precio) VALUES(?,?,?,?,?,?)";
        try {
            
            ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipo.getCodigo());
            ps.setString(2, tipo.getTipo());
            ps.setInt(3, tipo.getCapacidad());
            ps.setInt(4, tipo.getCantcamas());
            ps.setString(5, tipo.getTipocamas());
            ps.setDouble(6, tipo.getPrecio());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                tipo.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Tipo de Habitacion Creada");
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear Tipo de Habitacion "+ex);
          

        } 
       
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
    public ArrayList<habitacion> listarHabitacionesTipo(int codigoTipoh){
        String sql="SELECT * FROM habitacion JOIN tipodehabitacion ON (habitacion.Tipohabitacion=tipodehabitacion.Codigo) WHERE habitacion.Tipohabitacion=?";
        tipoDeHabitacionData tipoHdata=new tipoDeHabitacionData();
        ArrayList<habitacion> listadoHabitacionesT=new ArrayList<>();
        tipodehabitacion tipodeH=tipoHdata.BuscarporCodigo(codigoTipoh);
              
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, codigoTipoh);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                habitacion habit=new habitacion();
                habit.setNumero(rs.getInt(1));
               habit.setTipohabitacion(tipodeH);
                habit.setPiso(rs.getInt(3));
                habit.setEstado(rs.getBoolean(4));
                listadoHabitacionesT.add(habit);
            }

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error listando las habitaciones");
        }
        return listadoHabitacionesT;

    }
 
            public tipodehabitacion modificarTipo(tipodehabitacion tipo1){
        String sql="UPDATE tipodehabitacion SET Tipo=?, Capacidad=?, Cantidadcamas=?, Tipocamas=?, Estado=? WHERE Codigo=?";
        try{
            ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            
            ps.setString(1, tipo1.getTipo());
            ps.setInt(2, tipo1.getCapacidad());
            ps.setInt(3, tipo1.getCantcamas());
            ps.setString(4, tipo1.getTipocamas());
            ps.setDouble(5, tipo1.getPrecio());
            ps.setInt(6, tipo1.getCodigo());
            ps.executeUpdate();
            rs= ps.getGeneratedKeys();
            if (rs.next()) {
                        tipo1.setCodigo(rs.getInt(1));
            }

                JOptionPane.showMessageDialog(null," Habitacion modificada");

            return tipo1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error modificando habitacion");
        }
        return null;
    }
    
}
