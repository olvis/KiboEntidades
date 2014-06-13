/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades.reportes;

import java.util.Date;

/**
 *
 * @author Olvinho
 */
public class CensoGeneral implements java.io.Serializable {

    private Integer numero;
    private Date fecha;
    private String area;
    private String codigo;
    private Integer faja;
    private String bloque;
    private String especie;
    private String calidad;
    private Double dap;
    private Double altura;
    private Double volumen;
    private Byte estado;
    private Byte existe;

    public CensoGeneral() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getFaja() {
        return faja;
    }

    public void setFaja(Integer faja) {
        this.faja = faja;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Double getDap() {
        return dap;
    }

    public void setDap(Double dap) {
        this.dap = dap;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public byte getExiste() {
        return existe;
    }

    public void setExiste(byte existe) {
        this.existe = existe;
    }

}
