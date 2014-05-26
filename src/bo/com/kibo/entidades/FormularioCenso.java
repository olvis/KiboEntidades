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
public class FormularioCenso extends EncabezadoFormulario implements java.io.Serializable {

    private Area area;
    private Byte horas;
    private List<DetalleCenso> detalle = new ArrayList<>();

    public FormularioCenso() {

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

    public List<DetalleCenso> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleCenso> detalle) {
        this.detalle = detalle;
    }

    
}
