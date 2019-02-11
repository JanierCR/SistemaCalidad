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
public class Metas {
    private String anioMesMeta;
    private Usuario objUsuario = new Usuario();
    private String Descripcion;
    private int puntosSolicitados;
    private int puntosCertificados;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public String getAnioMesMeta() {
        return anioMesMeta;
    }

    public void setAnioMesMeta(String anioMesMeta) {
        this.anioMesMeta = anioMesMeta;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPuntosSolicitados() {
        return puntosSolicitados;
    }

    public void setPuntosSolicitados(int puntosSolicitados) {
        this.puntosSolicitados = puntosSolicitados;
    }

    public int getPuntosCertificados() {
        return puntosCertificados;
    }

    public void setPuntosCertificados(int puntosCertificados) {
        this.puntosCertificados = puntosCertificados;
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
