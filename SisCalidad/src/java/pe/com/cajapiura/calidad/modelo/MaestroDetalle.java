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
public class MaestroDetalle implements Serializable{
    private int idMaestroDetalle;
    private MaestroGenerico objMaestroGenerico= new  MaestroGenerico();
    private String nombreMestroDet;
    private String descripcionMaestroDet;
    private String estadoMaestroDet;
    private int valorEntero;
    private double valorDecimal;
    private double valorDecimal1;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdMaestroDetalle() {
        return idMaestroDetalle;
    }

    public void setIdMaestroDetalle(int idMaestroDetalle) {
        this.idMaestroDetalle = idMaestroDetalle;
    }

    public MaestroGenerico getObjMaestroGenerico() {
        return objMaestroGenerico;
    }

    public void setObjMaestroGenerico(MaestroGenerico objMaestroGenerico) {
        this.objMaestroGenerico = objMaestroGenerico;
    }

    public String getNombreMestroDet() {
        return nombreMestroDet;
    }

    public void setNombreMestroDet(String nombreMestroDet) {
        this.nombreMestroDet = nombreMestroDet;
    }

    public String getDescripcionMaestroDet() {
        return descripcionMaestroDet;
    }

    public void setDescripcionMaestroDet(String descripcionMaestroDet) {
        this.descripcionMaestroDet = descripcionMaestroDet;
    }

    public String getEstadoMaestroDet() {
        return estadoMaestroDet;
    }

    public void setEstadoMaestroDet(String estadoMaestroDet) {
        this.estadoMaestroDet = estadoMaestroDet;
    }

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int valorEntero) {
        this.valorEntero = valorEntero;
    }

    public double getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(double valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public double getValorDecimal1() {
        return valorDecimal1;
    }

    public void setValorDecimal1(double valorDecimal1) {
        this.valorDecimal1 = valorDecimal1;
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
