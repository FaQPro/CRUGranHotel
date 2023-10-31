

package Entidades;

/**

 */
public class huesped {

    private int idHuesped;
    private int Dni;
    private String Apellidoynom;
    private String Direccion;
    private String Correo;
    private String Celular;
    private boolean Estado;

    public huesped() {
    }
    
    public huesped(int idHuesped, int Dni, String Apellidoynom, String Direccion, String Correo, String Celular, boolean Estado) {
        this.idHuesped = idHuesped;
        this.Dni = Dni;
        this.Apellidoynom = Apellidoynom;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado;
    }

    public huesped(int Dni, String Apellidoynom, String Direccion, String Correo, String Celular, boolean Estado) {
        this.Dni = Dni;
        this.Apellidoynom = Apellidoynom;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getApellidoynom() {
        return Apellidoynom;
    }

    public void setApellidoynom(String Apellidoynom) {
        this.Apellidoynom = Apellidoynom;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return Apellidoynom+" "+idHuesped;
    }
    
    
}
