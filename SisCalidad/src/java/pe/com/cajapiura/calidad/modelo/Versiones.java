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
public class Versiones {
    private Solicitud objSolicitud = new Solicitud();
    private double idversion ;
    private Date fechaVersiones;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaPlanificada;
    private int numCasosPruebaTotales;
    private int numCasosPruebaEjecutados;
    private int numCasosPruebaError;
    private int tiempoTotal;
    private int tiempoEjecutados;
    private int tiempoError;
    private String comentario;
    private MaestroDetalle idEstadoVersion= new MaestroDetalle();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public Solicitud getObjSolicitud() {
        return objSolicitud;
    }

    public void setObjSolicitud(Solicitud objSolicitud) {
        this.objSolicitud = objSolicitud;
    }

    public double getIdversion() {
        return idversion;
    }

    public void setIdversion(double idversion) {
        this.idversion = idversion;
    }

    public Date getFechaVersiones() {
        return fechaVersiones;
    }

    public void setFechaVersiones(Date fechaVersiones) {
        this.fechaVersiones = fechaVersiones;
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

    public Date getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(Date fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public int getNumCasosPruebaTotales() {
        return numCasosPruebaTotales;
    }

    public void setNumCasosPruebaTotales(int numCasosPruebaTotales) {
        this.numCasosPruebaTotales = numCasosPruebaTotales;
    }

    public int getNumCasosPruebaEjecutados() {
        return numCasosPruebaEjecutados;
    }

    public void setNumCasosPruebaEjecutados(int numCasosPruebaEjecutados) {
        this.numCasosPruebaEjecutados = numCasosPruebaEjecutados;
    }

    public int getNumCasosPruebaError() {
        return numCasosPruebaError;
    }

    public void setNumCasosPruebaError(int numCasosPruebaError) {
        this.numCasosPruebaError = numCasosPruebaError;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public int getTiempoEjecutados() {
        return tiempoEjecutados;
    }

    public void setTiempoEjecutados(int tiempoEjecutados) {
        this.tiempoEjecutados = tiempoEjecutados;
    }

    public int getTiempoError() {
        return tiempoError;
    }

    public void setTiempoError(int tiempoError) {
        this.tiempoError = tiempoError;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public MaestroDetalle getIdEstadoVersion() {
        return idEstadoVersion;
    }

    public void setIdEstadoVersion(MaestroDetalle idEstadoVersion) {
        this.idEstadoVersion = idEstadoVersion;
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
