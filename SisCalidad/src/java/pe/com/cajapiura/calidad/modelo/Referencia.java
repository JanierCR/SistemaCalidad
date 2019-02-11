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
public class Referencia {
    private double año;
    private String referencia;
    private MaestroDetalle idTipoReferencia = new MaestroDetalle();
    private Usuario objUsuario= new Usuario();
    private MaestroDetalle idAreaReferencia = new MaestroDetalle();
    private MaestroDetalle idpuestoReferencia = new MaestroDetalle();
    private Date fechaReferencia ;
    private String textoReferencia;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public double getAño() {
        return año;
    }

    public void setAño(double año) {
        this.año = año;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public MaestroDetalle getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(MaestroDetalle idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public MaestroDetalle getIdAreaReferencia() {
        return idAreaReferencia;
    }

    public void setIdAreaReferencia(MaestroDetalle idAreaReferencia) {
        this.idAreaReferencia = idAreaReferencia;
    }

    public MaestroDetalle getIdpuestoReferencia() {
        return idpuestoReferencia;
    }

    public void setIdpuestoReferencia(MaestroDetalle idpuestoReferencia) {
        this.idpuestoReferencia = idpuestoReferencia;
    }

    public Date getFechaReferencia() {
        return fechaReferencia;
    }

    public void setFechaReferencia(Date fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    public String getTextoReferencia() {
        return textoReferencia;
    }

    public void setTextoReferencia(String textoReferencia) {
        this.textoReferencia = textoReferencia;
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
