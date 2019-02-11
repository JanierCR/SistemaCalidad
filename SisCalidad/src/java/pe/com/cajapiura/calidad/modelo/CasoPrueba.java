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
public class CasoPrueba implements Serializable{
    private MatrizCP objMatriz = new MatrizCP();
    private int idCasoPrueba;
    private Usuario objUsuario = new Usuario();
    private String moduloCasoPrueba;
    private String aplicacion;
    private String transaccion;
    private String escenario;
    private String resultadoEsperado;
    private MaestroDetalle idImpacto= new MaestroDetalle();
    private MaestroDetalle idPrioridad= new MaestroDetalle();
    private MaestroDetalle idProbabilidad= new MaestroDetalle();
    private MaestroDetalle idTipoCasosPrueba= new MaestroDetalle();
    private int tiempoCasoPrueba ;
    private MaestroDetalle idEstadoCasosPrueba= new MaestroDetalle();
    private Usuario objUsuarioCalidad = new Usuario();
    private String resultadoObtenido;
    private Date fechaPrueba;
    private String comentario;
    private MaestroDetalle idCategoria= new MaestroDetalle();
    private int ordenEjecutado;
    private int numeroVecesEjecutado;
    private String usuarioRegistro;
    private Date fechaRegistro;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public MatrizCP getObjMatriz() {
        return objMatriz;
    }

    public void setObjMatriz(MatrizCP objMatriz) {
        this.objMatriz = objMatriz;
    }

    public int getIdCasoPrueba() {
        return idCasoPrueba;
    }

    public void setIdCasoPrueba(int idCasoPrueba) {
        this.idCasoPrueba = idCasoPrueba;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public String getModuloCasoPrueba() {
        return moduloCasoPrueba;
    }

    public void setModuloCasoPrueba(String moduloCasoPrueba) {
        this.moduloCasoPrueba = moduloCasoPrueba;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public MaestroDetalle getIdImpacto() {
        return idImpacto;
    }

    public void setIdImpacto(MaestroDetalle idImpacto) {
        this.idImpacto = idImpacto;
    }

    public MaestroDetalle getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(MaestroDetalle idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public MaestroDetalle getIdProbabilidad() {
        return idProbabilidad;
    }

    public void setIdProbabilidad(MaestroDetalle idProbabilidad) {
        this.idProbabilidad = idProbabilidad;
    }

    public MaestroDetalle getIdTipoCasosPrueba() {
        return idTipoCasosPrueba;
    }

    public void setIdTipoCasosPrueba(MaestroDetalle idTipoCasosPrueba) {
        this.idTipoCasosPrueba = idTipoCasosPrueba;
    }

    public int getTiempoCasoPrueba() {
        return tiempoCasoPrueba;
    }

    public void setTiempoCasoPrueba(int tiempoCasoPrueba) {
        this.tiempoCasoPrueba = tiempoCasoPrueba;
    }

    public MaestroDetalle getIdEstadoCasosPrueba() {
        return idEstadoCasosPrueba;
    }

    public void setIdEstadoCasosPrueba(MaestroDetalle idEstadoCasosPrueba) {
        this.idEstadoCasosPrueba = idEstadoCasosPrueba;
    }

    public Usuario getObjUsuarioCalidad() {
        return objUsuarioCalidad;
    }

    public void setObjUsuarioCalidad(Usuario objUsuarioCalidad) {
        this.objUsuarioCalidad = objUsuarioCalidad;
    }

    public String getResultadoObtenido() {
        return resultadoObtenido;
    }

    public void setResultadoObtenido(String resultadoObtenido) {
        this.resultadoObtenido = resultadoObtenido;
    }

    public Date getFechaPrueba() {
        return fechaPrueba;
    }

    public void setFechaPrueba(Date fechaPrueba) {
        this.fechaPrueba = fechaPrueba;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public MaestroDetalle getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(MaestroDetalle idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getOrdenEjecutado() {
        return ordenEjecutado;
    }

    public void setOrdenEjecutado(int ordenEjecutado) {
        this.ordenEjecutado = ordenEjecutado;
    }

    public int getNumeroVecesEjecutado() {
        return numeroVecesEjecutado;
    }

    public void setNumeroVecesEjecutado(int numeroVecesEjecutado) {
        this.numeroVecesEjecutado = numeroVecesEjecutado;
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
