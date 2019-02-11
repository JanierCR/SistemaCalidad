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
public class DetalleSolicitud implements Serializable{
    private int idDetalleSolicitud;
    private Solicitud objSolicitud = new  Solicitud();
    private MaestroDetalle idTipoPase = new MaestroDetalle();
    private int numeroDefinitivo;
    private Date fechaRecibidoProduccion;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdDetalleSolicitud() {
        return idDetalleSolicitud;
    }

    public void setIdDetalleSolicitud(int idDetalleSolicitud) {
        this.idDetalleSolicitud = idDetalleSolicitud;
    }

    public Solicitud getObjSolicitud() {
        return objSolicitud;
    }

    public void setObjSolicitud(Solicitud objSolicitud) {
        this.objSolicitud = objSolicitud;
    }

    
    public MaestroDetalle getIdTipoPase() {
        return idTipoPase;
    }

    public void setIdTipoPase(MaestroDetalle idTipoPase) {
        this.idTipoPase = idTipoPase;
    }

    public int getNumeroDefinitivo() {
        return numeroDefinitivo;
    }

    public void setNumeroDefinitivo(int numeroDefinitivo) {
        this.numeroDefinitivo = numeroDefinitivo;
    }

    public Date getFechaRecibidoProduccion() {
        return fechaRecibidoProduccion;
    }

    public void setFechaRecibidoProduccion(Date fechaRecibidoProduccion) {
        this.fechaRecibidoProduccion = fechaRecibidoProduccion;
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
