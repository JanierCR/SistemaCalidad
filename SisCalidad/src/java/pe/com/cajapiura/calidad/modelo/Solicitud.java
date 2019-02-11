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
public class Solicitud {
    private double idSolicitud;
    private SubServicio objSubServicio = new SubServicio();
    private Date fechaRecepcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private String ambiente;
    private MaestroDetalle idEstadoSolictud = new MaestroDetalle();
    private Date fechaDetenido;
    private int numeroEnvios;
    private int tipoError;
    private int paseOrigen;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public double getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(double idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public SubServicio getObjSubServicio() {
        return objSubServicio;
    }

    public void setObjSubServicio(SubServicio objSubServicio) {
        this.objSubServicio = objSubServicio;
    }
    
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public MaestroDetalle getIdEstadoSolictud() {
        return idEstadoSolictud;
    }

    public void setIdEstadoSolictud(MaestroDetalle idEstadoSolictud) {
        this.idEstadoSolictud = idEstadoSolictud;
    }
  
    public Date getFechaDetenido() {
        return fechaDetenido;
    }

    public void setFechaDetenido(Date fechaDetenido) {
        this.fechaDetenido = fechaDetenido;
    }

    public int getNumeroEnvios() {
        return numeroEnvios;
    }

    public void setNumeroEnvios(int numeroEnvios) {
        this.numeroEnvios = numeroEnvios;
    }

    public int getTipoError() {
        return tipoError;
    }

    public void setTipoError(int tipoError) {
        this.tipoError = tipoError;
    }

    public int getPaseOrigen() {
        return paseOrigen;
    }

    public void setPaseOrigen(int paseOrigen) {
        this.paseOrigen = paseOrigen;
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
