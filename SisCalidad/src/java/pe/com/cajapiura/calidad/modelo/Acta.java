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
public class Acta implements Serializable{
    
    private int idActa;
    private int Año;
    private Solicitud objSolicitud = new Solicitud();
    private Usuario objUsurio = new Usuario();
    private MaestroDetalle tipoUsuarioActa = new MaestroDetalle();
    private MaestroDetalle tipoActa = new MaestroDetalle();
    private Date fechaInicio;
    private Date fechaFin;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdActa() {
        return idActa;
    }

    public void setIdActa(int idActa) {
        this.idActa = idActa;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public Solicitud getObjSolicitud() {
        return objSolicitud;
    }

    public void setObjSolicitud(Solicitud objSolicitud) {
        this.objSolicitud = objSolicitud;
    }

    public Usuario getObjUsurio() {
        return objUsurio;
    }

    public void setObjUsurio(Usuario objUsurio) {
        this.objUsurio = objUsurio;
    }    

    public MaestroDetalle getTipoUsuarioActa() {
        return tipoUsuarioActa;
    }

    public void setTipoUsuarioActa(MaestroDetalle tipoUsuarioActa) {
        this.tipoUsuarioActa = tipoUsuarioActa;
    }

    public MaestroDetalle getTipoActa() {
        return tipoActa;
    }

    public void setTipoActa(MaestroDetalle tipoActa) {
        this.tipoActa = tipoActa;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
