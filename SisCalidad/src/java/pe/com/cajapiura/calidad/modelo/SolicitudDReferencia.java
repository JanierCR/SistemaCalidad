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
public class SolicitudDReferencia {    
    private Referencia objReferencia = new Referencia();
    private DetalleSolicitud objDetalleSolicitud= new DetalleSolicitud();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public Referencia getObjReferencia() {
        return objReferencia;
    }

    public void setObjReferencia(Referencia objReferencia) {
        this.objReferencia = objReferencia;
    }

    public DetalleSolicitud getObjDetalleSolicitud() {
        return objDetalleSolicitud;
    }

    public void setObjDetalleSolicitud(DetalleSolicitud objDetalleSolicitud) {
        this.objDetalleSolicitud = objDetalleSolicitud;
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
