/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

/**
 *
 * @author Olvinho
 */
public class DetalleCorta implements java.io.Serializable {

    private Integer id;
    private Calidad calidad;
    private Carga carga;
    private Troza troza;
    private Especie especie;
    private Float dmayor;
    private Float dmenor;
    private Float largo;
    private String observaciones;

    public DetalleCorta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Troza getTroza() {
        return troza;
    }

    public void setTroza(Troza troza) {
        this.troza = troza;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Float getDmayor() {
        return dmayor;
    }

    public void setDmayor(Float dmayor) {
        this.dmayor = dmayor;
    }

    public Float getDmenor() {
        return dmenor;
    }

    public void setDmenor(Float dmenor) {
        this.dmenor = dmenor;
    }


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
