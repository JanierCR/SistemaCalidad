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
public class MacroServicio implements Serializable{
    private int idmacroServicio;
    private String nombreMacroServicio;
    private String descripcion;
    private MaestroDetalle idAreMacroServicio = new MaestroDetalle();
    private MaestroDetalle idEstado= new MaestroDetalle();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdmacroServicio() {
        return idmacroServicio;
    }

    public void setIdmacroServicio(int idmacroServicio) {
        this.idmacroServicio = idmacroServicio;
    }

    public String getNombreMacroServicio() {
        return nombreMacroServicio;
    }

    public void setNombreMacroServicio(String nombreMacroServicio) {
        this.nombreMacroServicio = nombreMacroServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MaestroDetalle getIdAreMacroServicio() {
        return idAreMacroServicio;
    }

    public void setIdAreMacroServicio(MaestroDetalle idAreMacroServicio) {
        this.idAreMacroServicio = idAreMacroServicio;
    }

    public MaestroDetalle getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(MaestroDetalle idEstado) {
        this.idEstado = idEstado;
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
