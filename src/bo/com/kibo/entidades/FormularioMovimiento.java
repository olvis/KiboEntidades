/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olvinho
 */
public class FormularioMovimiento extends EncabezadoFormulario implements java.io.Serializable {

    private Destino destino;
    private Boolean despacho;
    private Area area;
    private Byte horas;
    private List<DetalleMovimiento> detalle = new ArrayList<>();

    public FormularioMovimiento() {
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(Boolean despacho) {
        this.despacho = despacho;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Byte getHoras() {
        return horas;
    }

    public void setHoras(Byte horas) {
        this.horas = horas;
    }

    public List<DetalleMovimiento> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleMovimiento> detalle) {
        this.detalle = detalle;
    }
    

}
