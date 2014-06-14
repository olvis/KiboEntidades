/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import bo.com.kibo.entidades.intf.IFormularioPostCenso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olvinho
 */
public class FormularioMovimiento
        extends EncabezadoFormulario
        implements java.io.Serializable, IFormularioPostCenso {

    private String destino;
    private Area area;
    private Byte horas;
    private String guia;
    private List<DetalleMovimiento> detalle = new ArrayList<>();

    public FormularioMovimiento() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    @Override
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public Byte getHoras() {
        return horas;
    }

    public void setHoras(Byte horas) {
        this.horas = horas;
    }

    @Override
    public List<DetalleMovimiento> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleMovimiento> detalle) {
        this.detalle = detalle;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getGuia() {
        return guia;
    }
    
}
