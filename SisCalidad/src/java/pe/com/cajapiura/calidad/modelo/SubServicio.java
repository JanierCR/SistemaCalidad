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
public class SubServicio {
    private int idSubServicio;
    private String nombreSubservicio;
    private String DescripcionSubServicio;
    private MaestroDetalle idEstadoSubservicio = new MaestroDetalle();
    private Servicio objServicio = new Servicio();
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public int getIdSubServicio() {
        return idSubServicio;
    }

    public void setIdSubServicio(int idSubServicio) {
        this.idSubServicio = idSubServicio;
    }

    public String getNombreSubservicio() {
        return nombreSubservicio;
    }

    public void setNombreSubservicio(String nombreSubservicio) {
        this.nombreSubservicio = nombreSubservicio;
    }

    public String getDescripcionSubServicio() {
        return DescripcionSubServicio;
    }

    public void setDescripcionSubServicio(String DescripcionSubServicio) {
        this.DescripcionSubServicio = DescripcionSubServicio;
    }

    public MaestroDetalle getIdEstadoSubservicio() {
        return idEstadoSubservicio;
    }

    public void setIdEstadoSubservicio(MaestroDetalle idEstadoSubservicio) {
        this.idEstadoSubservicio = idEstadoSubservicio;
    }

    public Servicio getObjServicio() {
        return objServicio;
    }

    public void setObjServicio(Servicio objServicio) {
        this.objServicio = objServicio;
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
