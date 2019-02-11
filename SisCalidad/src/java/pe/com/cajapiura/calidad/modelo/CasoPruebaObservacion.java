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
public class CasoPruebaObservacion implements Serializable{
    private CasoPrueba objCasoPrueba=new CasoPrueba();
    private Observacion objObservacion = new Observacion();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public CasoPrueba getObjCasoPrueba() {
        return objCasoPrueba;
    }

    public void setObjCasoPrueba(CasoPrueba objCasoPrueba) {
        this.objCasoPrueba = objCasoPrueba;
    }

    public Observacion getObjObservacion() {
        return objObservacion;
    }

    public void setObjObservacion(Observacion objObservacion) {
        this.objObservacion = objObservacion;
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
