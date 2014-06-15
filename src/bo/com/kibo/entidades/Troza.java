/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import bo.com.kibo.entidades.intf.ISincronizable;
import java.util.Date;

/**
 *
 * @author Olvinho
 */
public class Troza implements java.io.Serializable, ISincronizable {

    public static final byte ESTADO_CENSADA = 0;
    public static final byte ESTADO_TALADA = 1;
    public static byte ESTADO_ENPATIO = 2;

    public static final byte EXISTE_EXISTE = 0;
    public static final byte EXISTE_SECCIONADA = 1;
    public static final byte EXISTE_CIERRE_INVENTARIO = 2;
    public static final byte EXISTE_BAJA = 3;
    public static final byte EXISTE_RECHAZADA_TALA = 4;
    public static final byte EXISTE_RECHAZADA_EXTRACCION = 5;
    public static final byte EXISTE_DESPACHADA = 6;

    public static final String SEPARADOR_CODIGO = ".";

    private Integer numero;
    private Troza padre;
    private Especie especie;
    private Calidad calidad;
    private Area area;
    private String codigo;
    private Float dMayor;
    private Float dMenor;
    private Float largo;
    private Patio patio;
    private Byte estado;
    private Byte existe;
    private Double x;
    private Double y;
    private FormularioCenso formularioCenso;
    private FormularioCorta formularioCorta;
    private FormularioExtraccion formularioExtraccion;
    private FormularioMovimiento formularioDespacho;
    private Faja faja;
    private Date modificado;

    public Troza() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Troza getPadre() {
        return padre;
    }

    public void setPadre(Troza padre) {
        this.padre = padre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getdMayor() {
        return dMayor;
    }

    public void setdMayor(Float dMayor) {
        this.dMayor = dMayor;
    }

    public Float getdMenor() {
        return dMenor;
    }

    public void setdMenor(Float dMenor) {
        this.dMenor = dMenor;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Patio getPatio() {
        return patio;
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

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public FormularioCenso getFormularioCenso() {
        return formularioCenso;
    }

    public void setFormularioCenso(FormularioCenso formularioCenso) {
        this.formularioCenso = formularioCenso;
    }

    public FormularioCorta getFormularioCorta() {
        return formularioCorta;
    }

    public void setFormularioCorta(FormularioCorta formularioCorta) {
        this.formularioCorta = formularioCorta;
    }

    public FormularioExtraccion getFormularioExtraccion() {
        return formularioExtraccion;
    }

    public void setFormularioExtraccion(FormularioExtraccion formularioExtraccion) {
        this.formularioExtraccion = formularioExtraccion;
    }

    public void setFormularioDespacho(FormularioMovimiento formularioDespacho) {
        this.formularioDespacho = formularioDespacho;
    }

    public FormularioMovimiento getFormularioDespacho() {
        return formularioDespacho;
    }

    public Faja getFaja() {
        return faja;
    }

    public void setFaja(Faja faja) {
        this.faja = faja;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }
}
