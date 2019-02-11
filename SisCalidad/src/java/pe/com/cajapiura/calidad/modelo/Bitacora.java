/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cajapiura.calidad.modelo;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author jfarias
 */
public class Bitacora implements Serializable{
    private int idBitacora;
    private Solicitud objSolicitud=new Solicitud();
    private Date fechaInicio;
    private MaestroDetalle idTipoBitacora = new MaestroDetalle();
    private Date fechaFin;
    private String comentario;
    private String descripcion;
    private int alertaBitacora;
    private MaestroDetalle idEstadoBitacora=new MaestroDetalle();
    private String usuarioAprobacion;
    private Date fechaaprovacion;
    private Timestamp fechaHoraAlerta;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(int idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Solicitud getObjSolicitud() {
        return objSolicitud;
    }

    public void setObjSolicitud(Solicitud objSolicitud) {
        this.objSolicitud = objSolicitud;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public MaestroDetalle getIdTipoBitacora() {
        return idTipoBitacora;
    }

    public void setIdTipoBitacora(MaestroDetalle idTipoBitacora) {
        this.idTipoBitacora = idTipoBitacora;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAlertaBitacora() {
        return alertaBitacora;
    }

    public void setAlertaBitacora(int alertaBitacora) {
        this.alertaBitacora = alertaBitacora;
    }

    public MaestroDetalle getIdEstadoBitacora() {
        return idEstadoBitacora;
    }

    public void setIdEstadoBitacora(MaestroDetalle idEstadoBitacora) {
        this.idEstadoBitacora = idEstadoBitacora;
    }

    public String getUsuarioAprobacion() {
        return usuarioAprobacion;
    }

    public void setUsuarioAprobacion(String usuarioAprobacion) {
        this.usuarioAprobacion = usuarioAprobacion;
    }

    public Date getFechaaprovacion() {
        return fechaaprovacion;
    }

    public void setFechaaprovacion(Date fechaaprovacion) {
        this.fechaaprovacion = fechaaprovacion;
    }

    public Timestamp getFechaHoraAlerta() {
        return fechaHoraAlerta;
    }

    public void setFechaHoraAlerta(Timestamp fechaHoraAlerta) {
        this.fechaHoraAlerta = fechaHoraAlerta;
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
