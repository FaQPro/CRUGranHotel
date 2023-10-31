

package AccesoAdatos;

import Entidades.habitacion;
import Entidades.tipodehabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 */
public class habitacionData {

    private Connection con=null;
    public habitacionData(){
    con=Conexion.getConnection();   
    }
    
    public void guardarHabitacion(habitacion habit){
       
        String sql="INSERT INTO habitacion (Numero, TipoHabitacion, Piso, Estado) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1,habit.getNumero());
            ps.setInt(2,habit.getTipohabitacion().getCodigo());
            ps.setInt(3,habit.getPiso());
            ps.setBoolean(4,habit.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Se ha guardado la habitacion nro "+habit.getNumero());
                habit.setNumero(rs.getInt(1));
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar habitacion ");
            
            
        }
    }  
    
     public ArrayList <habitacion> listarHabitacion()    {
        ArrayList<habitacion> listado=new ArrayList<>();
        String sql="SELECT * FROM habitacion ";
       
        try{
            
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
                     
            while(rs.next()){
                String sqlTh="SELECT * FROM tipodehabitacion WHERE Codigo=?";
                PreparedStatement psTh=con.prepareStatement(sqlTh);
                psTh.setInt(1, rs.getInt(2));
                ResultSet rsTh=psTh.executeQuery();
                if(rsTh.next()){
                    tipodehabitacion tipoH=new tipodehabitacion();
                    tipoH.setCodigo(rsTh.getInt(1));
                    tipoH.setTipo(rsTh.getString(2));
                    tipoH.setCapacidad(rsTh.getInt(3));
                    tipoH.setCantcamas(rsTh.getInt(4));
                    tipoH.setTipocamas(rsTh.getString(5));
                    tipoH.setPrecio(rsTh.getDouble(6));
                            
                    habitacion hab=new habitacion();
                    hab.setNumero(rs.getInt(1));
                    hab.setTipohabitacion(tipoH);
                    hab.setPiso(rs.getInt("Piso"));
                    hab.setEstado(rs.getBoolean("Estado"));
                    listado.add(hab);
                }
                
            }
              return listado;        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error buscando habitacion");
            return null;
        }
     
    }
    
    public void modificarHabitacion(habitacion habit){
               
        String sql="UPDATE habitacion SET TipoHabitacion=? , Estado=? WHERE Numero=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, habit.getTipohabitacion().getCodigo());
            ps.setBoolean(2, habit.isEstado());
            ps.setInt(3, habit.getNumero());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null,"Se ha modificado la habitacion nro "+habit.getNumero());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error modificando habitacion");
        }
    }
    public void eliminarHabitacion(habitacion habit){
        String sql="UPDATE habitacion SET Estado=false WHERE Numero=?";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, habit.getNumero());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha inactivado la habitacion nro"+habit.getNumero());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al intentar inactivar la habitacion");
            
        }
    }
 
    public habitacion buscarHabitacion(int numero)    {
        habitacion hab=new habitacion();
        String sql="SELECT * FROM habitacion JOIN tipodehabitacion ON (habitacion.Tipohabitacion=tipodehabitacion.Codigo) WHERE numero=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, numero);
            System.out.println(numero);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
               
                
                tipodehabitacion tipoh =new tipodehabitacion();
                tipoh.setCodigo(rs.getInt("Codigo"));
                tipoh.setPrecio(rs.getInt("Precio"));
                tipoh.setCantcamas(rs.getInt("Cantidadcamas"));
                tipoh.setTipo(rs.getString("Tipo"));
                tipoh.setTipocamas(rs.getString("Tipocamas"));
                tipoh.setCapacidad(rs.getInt("Capacidad"));
                
                hab.setNumero(numero);
                hab.setTipohabitacion(tipoh);
                hab.setPiso(rs.getInt(3));
                hab.setEstado(rs.getBoolean(4));
                return hab;
                
            
             
            }else { JOptionPane.showMessageDialog(null,"Habitación no encontrada");
            
            }
                
        }catch (SQLException ex){
           // System.out.println(ex.getMessage()+ex.getSQLState()+ex.getErrorCode()+ex.getLocalizedMessage()+ex.getStackTrace().toString()+ex.fillInStackTrace());
            JOptionPane.showMessageDialog(null,"Error buscando habitacion");
            
        }
    return hab;
    }
    /*
     public  habitacion buscarHabitacionR(int numero)    {
        habitacion hab=new habitacion();
        String sql="SELECT * FROM habitacion WHERE numero=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, numero);
            System.out.println(numero);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
               
                
                tipodehabitacion tipoh =new tipodehabitacion();
                tipoh.setCodigo(rs.getInt("Codigo"));
                tipoh.setPrecio(rs.getInt("Precio"));
                tipoh.setCantcamas(rs.getInt("Cantidadcamas"));
                tipoh.setTipo(rs.getString("Tipo"));
                tipoh.setTipocamas(rs.getString("Tipocamas"));
                tipoh.setCapacidad(rs.getInt("Capacidad"));
                
                hab.setNumero(numero);
                hab.setTipohabitacion(tipoh);
                hab.setPiso(rs.getInt(3));
                hab.setEstado(rs.getBoolean(4));
                return hab;
                
            
             
            }else { JOptionPane.showMessageDialog(null,"Habitación no encontrada");
            
            }
                
        }catch (SQLException ex){
           // System.out.println(ex.getMessage()+ex.getSQLState()+ex.getErrorCode()+ex.getLocalizedMessage()+ex.getStackTrace().toString()+ex.fillInStackTrace());
            JOptionPane.showMessageDialog(null,"Error buscando habitacion");
            
        }
    return hab;
    }
    */    
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

   
      
    }