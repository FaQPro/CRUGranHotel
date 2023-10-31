

package Entidades;

import java.sql.Date;


/**

 */
public class reserva {

    
    private int idReserva;
    private habitacion nrohabitacion;
    private huesped idHuesped;
    private Date FechaEntrada;
    private Date FechaSalida;
    private int Personas;
    private double ImporteTotal;
    private boolean Estado;
    
    
        public reserva() {
    }

    public reserva(habitacion nrohabitacion, huesped idHuesped, Date FechaEntrada, Date FechaSalida, int personas, double ImporteTotal, boolean estado) {
        this.nrohabitacion = nrohabitacion;
        this.idHuesped = idHuesped;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.Personas = personas;
        this.ImporteTotal = ImporteTotal;
        this.Estado = estado;
    }

    public reserva(int idReserva, habitacion nrohabitacion, huesped idHuesped, Date FechaEntrada, Date FechaSalida, int personas, double ImporteTotal, boolean estado) {
        this.idReserva = idReserva;
        this.nrohabitacion = nrohabitacion;
        this.idHuesped = idHuesped;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.Personas = personas;
        this.ImporteTotal = ImporteTotal;
        this.Estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public habitacion getNrohabitacion() {
        return nrohabitacion;
    }

    public void setNrohabitacion(habitacion nrohabitacion) {
        this.nrohabitacion = nrohabitacion;
    }

    public huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int personas) {
        this.Personas = personas;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(double ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        this.Estado = estado;
    }
        
        
}

