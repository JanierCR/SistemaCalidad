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
public class Usuario {
    private String idUsuario;
    private MaestroDetalle idTipoUsuario = new MaestroDetalle();
    private String nombreUsuario;
    private String apellidoPaternoUsuario;
    private String apellidoMaternoUsuario;
    private Date fechaIngreso;
    private MaestroDetalle idPuestoUsuario = new MaestroDetalle();
    private String telefonos;
    private Date fechanacimiento;
    private MaestroDetalle idFlag = new MaestroDetalle();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public MaestroDetalle getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(MaestroDetalle idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoPaternoUsuario() {
        return apellidoPaternoUsuario;
    }

    public void setApellidoPaternoUsuario(String apellidoPaternoUsuario) {
        this.apellidoPaternoUsuario = apellidoPaternoUsuario;
    }

    public String getApellidoMaternoUsuario() {
        return apellidoMaternoUsuario;
    }

    public void setApellidoMaternoUsuario(String apellidoMaternoUsuario) {
        this.apellidoMaternoUsuario = apellidoMaternoUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public MaestroDetalle getIdPuestoUsuario() {
        return idPuestoUsuario;
    }

    public void setIdPuestoUsuario(MaestroDetalle idPuestoUsuario) {
        this.idPuestoUsuario = idPuestoUsuario;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public MaestroDetalle getIdFlag() {
        return idFlag;
    }

    public void setIdFlag(MaestroDetalle idFlag) {
        this.idFlag = idFlag;
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
