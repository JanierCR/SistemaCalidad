/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cajapiura.calidad.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jfarias
 */
public class MaestroGenerico implements Serializable{
    private int idMaestroGenerico;
    private String nombreMaestrogen;
    private String descripcionMaestrogen;
    private int mantenible;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdMaestroGenerico() {
        return idMaestroGenerico;
    }

    public void setIdMaestroGenerico(int idMaestroGenerico) {
        this.idMaestroGenerico = idMaestroGenerico;
    }

    public String getNombreMaestrogen() {
        return nombreMaestrogen;
    }

    public void setNombreMaestrogen(String nombreMaestrogen) {
        this.nombreMaestrogen = nombreMaestrogen;
    }

    public String getDescripcionMaestrogen() {
        return descripcionMaestrogen;
    }

    public void setDescripcionMaestrogen(String descripcionMaestrogen) {
        this.descripcionMaestrogen = descripcionMaestrogen;
    }

    public int getMantenible() {
        return mantenible;
    }

    public void setMantenible(int mantenible) {
        this.mantenible = mantenible;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    
    
    
}
