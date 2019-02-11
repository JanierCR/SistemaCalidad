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
public class ServidorAplicacion {
    private Servidores objServidores = new Servidores();
    private Aplicaciones objAplicaciones = new Aplicaciones();
    private MaestroDetalle idAreaResponsable = new MaestroDetalle();
    private MaestroDetalle idEstado = new MaestroDetalle();
    private String configBibliotecas;
    private String comandos;
    private String notas;
    private String rutas;
    private Solicitud objSolictud = new Solicitud();
    private String usuarioBD;
    private String puertosHUTDOWN;
    private String puertoAJP;
    private Date fechaServidor;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public Servidores getObjServidores() {
        return objServidores;
    }

    public void setObjServidores(Servidores objServidores) {
        this.objServidores = objServidores;
    }

    public Aplicaciones getObjAplicaciones() {
        return objAplicaciones;
    }

    public void setObjAplicaciones(Aplicaciones objAplicaciones) {
        this.objAplicaciones = objAplicaciones;
    }

    public MaestroDetalle getIdAreaResponsable() {
        return idAreaResponsable;
    }

    public void setIdAreaResponsable(MaestroDetalle idAreaResponsable) {
        this.idAreaResponsable = idAreaResponsable;
    }

    public MaestroDetalle getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(MaestroDetalle idEstado) {
        this.idEstado = idEstado;
    }

    public String getConfigBibliotecas() {
        return configBibliotecas;
    }

    public void setConfigBibliotecas(String configBibliotecas) {
        this.configBibliotecas = configBibliotecas;
    }

    public String getComandos() {
        return comandos;
    }

    public void setComandos(String comandos) {
        this.comandos = comandos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public Solicitud getObjSolictud() {
        return objSolictud;
    }

    public void setObjSolictud(Solicitud objSolictud) {
        this.objSolictud = objSolictud;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getPuertosHUTDOWN() {
        return puertosHUTDOWN;
    }

    public void setPuertosHUTDOWN(String puertosHUTDOWN) {
        this.puertosHUTDOWN = puertosHUTDOWN;
    }

    public String getPuertoAJP() {
        return puertoAJP;
    }

    public void setPuertoAJP(String puertoAJP) {
        this.puertoAJP = puertoAJP;
    }

    public Date getFechaServidor() {
        return fechaServidor;
    }

    public void setFechaServidor(Date fechaServidor) {
        this.fechaServidor = fechaServidor;
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
