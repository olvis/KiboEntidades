/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import bo.com.kibo.entidades.intf.IDetallePostCenso;

/**
 *
 * @author Olvinho
 */
public class DetalleExtraccion 
implements java.io.Serializable , IDetallePostCenso{

    private Integer id;
    private Troza troza;
    private Especie especie;
    private Carga carga;
    private Patio patio;
    private Calidad calidad;
    private Float dmayor;
    private Float dmenor;
    private Float largo;
    private String observaciones;

    public DetalleExtraccion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Troza getTroza() {
        return troza;
    }

    public void setTroza(Troza troza) {
        this.troza = troza;
    }

    @Override
    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    @Override
    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    @Override
    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }

    @Override
    public Float getDmayor() {
        return dmayor;
    }

    public void setDmayor(Float dmayor) {
        this.dmayor = dmayor;
    }

    @Override
    public Float getDmenor() {
        return dmenor;
    }

    public void setDmenor(Float dmenor) {
        this.dmenor = dmenor;
    }

    @Override
    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
