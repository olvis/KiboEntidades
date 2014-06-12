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
public class DetalleCenso implements java.io.Serializable {

    private Integer id;
    private Calidad calidad;
    private Especie especie;
    private String codigo;
    private Float altura;
    private Float dap;
    private String condicion;
    private Integer punto;
    private Float x;
    private Float y;
    private String observaciones;
    private Troza troza;

    public DetalleCenso() {
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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getDap() {
        return dap;
    }

    public void setDap(Float dap) {
        this.dap = dap;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getPunto() {
        return punto;
    }

    public void setPunto(Integer punto) {
        this.punto = punto;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setTroza(Troza troza) {
        this.troza = troza;
    }

    public Troza getTroza() {
        return troza;
    }

}
