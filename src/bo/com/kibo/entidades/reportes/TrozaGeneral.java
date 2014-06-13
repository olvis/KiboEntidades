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
public class TrozaGeneral implements java.io.Serializable{

    private Integer numero;
    private Date fechaTala;
    private Date fechaArrastre;
    private String area;
    private Integer faja;
    private String bloque;
    private String codigo;
    private String especie;
    private String calidad;
    private Double dmayor;
    private Double dmenor;
    private Double largo;
    private Double volumen;
    private Byte estado;
    private Byte existe;
    
    public TrozaGeneral() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaTala() {
        return fechaTala;
    }

    public void setFechaTala(Date fechaTala) {
        this.fechaTala = fechaTala;
    }

    public Date getFechaArrastre() {
        return fechaArrastre;
    }

    public void setFechaArrastre(Date fechaArrastre) {
        this.fechaArrastre = fechaArrastre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Double getDmayor() {
        return dmayor;
    }

    public void setDmayor(Double dmayor) {
        this.dmayor = dmayor;
    }

    public Double getDmenor() {
        return dmenor;
    }

    public void setDmenor(Double dmenor) {
        this.dmenor = dmenor;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    public Byte getExiste() {
        return existe;
    }

    public void setExiste(Byte existe) {
        this.existe = existe;
    }
    
}
