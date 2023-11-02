

package AccesoAdatos;

import Entidades.huesped;
import Entidades.reserva;
import Entidades.tipodehabitacion;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**

 */
public class reservaData {
    private Connection con=null;      
    public reservaData(){
    this.con=Conexion.getConnection();
    
}
    
   public void guardarReserva(reserva reservaNueva){
 
    String sql="INSERT INTO reserva (nrohabitacion, idHuesped, FechaEntrada, FechaSalida, Personas, ImporteTotal, Estado) VALUES (?, ?, ?, ?, ?,?,?)";
    PreparedStatement ps;
    try {
        ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        ps.setInt(1, reservaNueva.getNrohabitacion().getNumero());
        
        ps.setInt(2, reservaNueva.getIdHuesped().getIdHuesped());
     
        ps.setDate(3, Date.valueOf(reservaNueva.getFechaEntrada()));
  
        ps.setDate(4, Date.valueOf(reservaNueva.getFechaSalida()));
     
        ps.setInt (5, reservaNueva.getPersonas());
       
        ps.setDouble(6,reservaNueva.getImporteTotal());
        
        ps.setBoolean(7, true);
    
        ps.executeUpdate();
    
        ResultSet rs = ps.getGeneratedKeys();
      
        if(rs.next()){
            reservaNueva.setIdReserva(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Se ha registrado la reserva");
            }
            ps.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al intentar guardar la reserva");
        }
}

    public void eliminar(int id, boolean es){
        if(es){
            try (PreparedStatement ps = con.prepareStatement("DELETE FROM `reserva` WHERE idReserva="+id)) {
                ps.executeUpdate();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error"+ex);
            }
        }else{
            try (PreparedStatement ps = con.prepareStatement("UPDATE `reserva` SET `estado`=0 WHERE idReserva="+id)) {
                ps.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Eliminada"+ex);
            }
        }
    }
   
public boolean verificarDisponible(int numeroHab, LocalDate fechaIng){
   String sql="SELECT * FROM reserva WHERE nrohabitacion=? AND Estado=true AND ? BETWEEN FechaEntrada AND FechaSalida";
   boolean resultado=true;
   try{
       PreparedStatement ps=con.prepareStatement(sql);
       Date Fecha=Date.valueOf(fechaIng);
       ps.setInt(1, numeroHab);
       ps.setDate(2, Fecha);
       ResultSet rs=ps.executeQuery();
       if(rs.next()){
           resultado=true;
       }else {resultado=false;}
       
   }catch(SQLException ex){
       JOptionPane.showMessageDialog(null,"Error");
   }
    
    
    
   return resultado; 
    
    
}

public reserva buscarresevaxfecha(LocalDate fecha){
    reserva reserva= new reserva();
        try {
            String sql="SELECT * FROM reserva WHERE  ? BETWEEN FechaEntrada AND FechaSalida";
            
            PreparedStatement ps=con.prepareStatement(sql);
            Date Fecha=Date.valueOf(fecha);
            ps.setDate(1, Fecha);
            ResultSet rs=ps.executeQuery();
       if(rs.next()){
           reserva.getIdHuesped();
           reserva.getNrohabitacion();
           reserva.getFechaEntrada();
           reserva.getFechaSalida();
           reserva.getImporteTotal();
           ps.close();
           return reserva;
       }else {
            JOptionPane.showMessageDialog(null, "Reserva inexistente ");
            ps.close();
            return null;
       }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error buscando Reservas");
       return null;
        }
        
}
    public reserva buscarreservaxhuesped(huesped huesped){
        reserva reserva= new reserva();
        
        try {
            String sql="SELECT * FROM reserva WHERE  idHuesped = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, huesped.getIdHuesped());
            ResultSet rs=ps.executeQuery();
             if(rs.next()){
           reserva.getIdHuesped();
           reserva.getNrohabitacion();
           reserva.getFechaEntrada();
           reserva.getFechaSalida();
           reserva.getImporteTotal();
           ps.close();
           return reserva;
             }else{
                 JOptionPane.showMessageDialog(null, "No existe reserva ");
            ps.close();
            return null;
             }
        } catch (SQLException ex) {
            Logger.getLogger(reservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return reserva;
} 
    
  public void borrarReserva(boolean estado){
        
        try {
           String sql = "UPDATE FROM reserva WHERE Estado = ?";
           PreparedStatement ps;
     
            ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(7, false);
    
            ps.executeUpdate();
    
            ResultSet rs = ps.getGeneratedKeys();
      
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Se ha eliminado la reserva");
            }
            ps.close();
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al intentar eliminar la reserva");
        }
        
    }  
    
 public List<reserva> buscarTodos() {
        List<reserva> rHuespedes = new ArrayList<>();
        String sql = "SELECT * FROM reserva";

        try (
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                reserva rHue = crearReservaHuesped(rs);
                rHuespedes.add(rHue);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar todas las reservas");
        }
        return rHuespedes;
    }
 
 public reserva crearReservaHuesped(ResultSet rs) throws SQLException {
        reserva rHuesped = new reserva();
        habitacionData habR = new habitacionData();
        huespedData hueR = new huespedData();

        rHuesped.setIdReserva(rs.getInt("idReserva"));
        rHuesped.setNrohabitacion(habR.buscarHabitacion(rs.getInt("nrohabitacion")));
        rHuesped.setIdHuesped(hueR.buscarporid(rs.getInt("idHuesped")));
        rHuesped.setFechaEntrada(rs.getDate("FechaEntrada").toLocalDate());
        rHuesped.setFechaSalida(rs.getDate("FechaSalida").toLocalDate());
        rHuesped.setPersonas(rs.getInt("Personas"));
        
        rHuesped.setImporteTotal(rs.getDouble("ImporteTotal"));
        
        rHuesped.setEstado(rs.getBoolean("Estado"));

        return rHuesped;

    }
 
}


   //DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?
  
    /*
    public void guardarReserva(reserva reservaNueva){
 
    String sql="INSERT INTO reserva SET nrohabitacion=?, idHuesped=?, FechaEntrada=?, FechaSalida=?, ImporteTotal=?, Estado=true ";
    
    try {
        PreparedStatement ps=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, reservaNueva.getNrohabitacion().getNumero());
        ps.setInt(2, reservaNueva.getIdHuesped().getIdHuesped());
        Date fechaEntrada=Date.valueOf(reservaNueva.getFechaEntrada());
        Date fechaSalida=Date.valueOf(reservaNueva.getFechaSalida());
        ps.setDate(3,fechaEntrada);
        ps.setDate(4, fechaSalida);
        ps.setDouble(5,reservaNueva.getImporteTotal());
        ps.executeUpdate();
       
        ResultSet rs= ps.getGeneratedKeys();
        if(rs.next()){
            reservaNueva.setIdReserva(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Reserva Registrada con exito. N°: "+rs);
        
            }
        ps.close();
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al guardar la reserva");
        }
    }
    
//        public void eliminarReserva(int idReserva){
 //       String sql="UPDATE SET estado=0 Where =?";
 //       try {
  //          PreparedStatement ps=con.prepareStatement(sql);
  //          ps.setInt(1, );
   //         ps.executeQuery();
  //          } catch (SQLException ex) {
     //       JOptionPane.showMessageDialog(null, "Error eliminando el huesped");
      */      
     //   }
    

    
    // ELIMINAR RESERVA

    //  BUSCAR RESERVA POR HUESPED 
    //String sql="SELECT * FROM reserva WHERE  idHuesped = ?";
    // BUSCAR RESERVA POR FECHAS
    // String sql="SELECT * FROM reserva WHERE  ? BETWEEN FechaEntrada AND FechaSalida"
    // BUSCAR RESERVA POR HUESPED  
    //String sql="SELECT * FROM reserva WHERE  idHuesped = ?"
    // CALCULAR DIAS ENTRE 2 FECHAS
    //String sql=" SELECT * FROM reserva WHERE DATEDIFF BETWEEN FechaEntrada AND FechaSalida"
    
    
