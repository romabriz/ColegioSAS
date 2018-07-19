package entidades;

import conexion.ConexionBase;
import java.sql.*;
import javax.swing.JOptionPane;

public class Persona {
    public Persona(String nombre, String apellido, int dni, long cuil, Date fechanac, String nacionalidad, String etnia, String direccion, String barrio, long telefono, long celular, String compañiacelular, String email, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
        this.fechanac = fechanac;
        this.nacionalidad = nacionalidad;
        this.etnia = etnia;
        this.direccion = direccion;
        this.barrio = barrio;
        this.telefono = telefono;
        this.celular = celular;
        this.compañiacelular = compañiacelular;
        this.email = email;
        this.estado = estado;
        this.localidad = new Localidad();
        this.sexo = new Sexo();
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCompañiacelular() {
        return compañiacelular;
    }

    public void setCompañiacelular(String compañiacelular) {
        this.compañiacelular = compañiacelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    ConexionBase conexion;
    
    private int idpersona;
    private String nombre;
    private String apellido;
    private int dni;
    private long cuil;
    private Date fechanac;
    private String nacionalidad;
    private String etnia;
    private String direccion;
    private String barrio;
    private long telefono;
    private long celular;
    private String compañiacelular;
    private String email;
    private String estado;
    private Localidad localidad;
    private Sexo sexo;

    
    public void CargarPersona(){
        try {
            conexion = new ConexionBase();
            Connection base = conexion.getConnection();
            
            PreparedStatement pst = base.prepareStatement("CALL insertarpersona (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, dni);
            pst.setLong(4, cuil);
            pst.setDate(5, fechanac);
            pst.setString(6, nacionalidad);
            pst.setString(7, etnia);
            pst.setString(8, direccion);
            pst.setString(9, barrio);
            pst.setLong(10, telefono);
            pst.setLong(11, celular);
            pst.setString(12, compañiacelular);
            pst.setString(13, email);
            pst.setString(14, estado);
            pst.setInt(15, this.localidad.getIdlocalidad());
            pst.setInt(16, this.sexo.getIdsexo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Persona cargada correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }            
    }
    
}
