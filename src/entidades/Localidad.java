/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Rodrigo
 */
public class Localidad {

    public int getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Localidad(int idlocalidad, String localidad) {
        this.idlocalidad = idlocalidad;
        this.localidad = localidad;
    }

    public Localidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    public Localidad() {
    }
    
    
    private int idlocalidad;
    private String localidad;
    
}
