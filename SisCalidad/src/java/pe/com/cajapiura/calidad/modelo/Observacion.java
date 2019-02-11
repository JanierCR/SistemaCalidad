/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cajapiura.calidad.modelo;

import java.util.Date;

/**
 *
 * @author jfarias
 */
public class Observacion {
    private int idObservacion ;
    private Solicitud objSolicitud;
    private Date fechaInicio;
    private String observacion;
    private MaestroDetalle idEstadoObservacion = new MaestroDetalle();
    private MaestroDetalle idtipoError  = new MaestroDetalle();
    private String usuarioCalidad;
    private MaestroDetalle idprioridad  = new MaestroDetalle();
    private Date fechaFin;
    private Date fechaCierre;
    private String documentoOBS;
    private String documentoCAL;
    private String comentarioDesUsu;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdObservacion() {
        return idObservacion;
    }

    public void setIdObservacion(int idObservacion) {
        this.idObservacion = idObservacion;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public MaestroDetalle getIdEstadoObservacion() {
        return idEstadoObservacion;
    }

    public void setIdEstadoObservacion(MaestroDetalle idEstadoObservacion) {
        this.idEstadoObservacion = idEstadoObservacion;
    }

    public MaestroDetalle getIdtipoError() {
        return idtipoError;
    }

    public void setIdtipoError(MaestroDetalle idtipoError) {
        this.idtipoError = idtipoError;
    }

    public String getUsuarioCalidad() {
        return usuarioCalidad;
    }

    public void setUsuarioCalidad(String usuarioCalidad) {
        this.usuarioCalidad = usuarioCalidad;
    }

    public MaestroDetalle getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(MaestroDetalle idprioridad) {
        this.idprioridad = idprioridad;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getDocumentoOBS() {
        return documentoOBS;
    }

    public void setDocumentoOBS(String documentoOBS) {
        this.documentoOBS = documentoOBS;
    }

    public String getDocumentoCAL() {
        return documentoCAL;
    }

    public void setDocumentoCAL(String documentoCAL) {
        this.documentoCAL = documentoCAL;
    }

    public String getComentarioDesUsu() {
        return comentarioDesUsu;
    }

    public void setComentarioDesUsu(String comentarioDesUsu) {
        this.comentarioDesUsu = comentarioDesUsu;
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
