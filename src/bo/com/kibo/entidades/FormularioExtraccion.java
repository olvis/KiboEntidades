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
public class FormularioExtraccion extends EncabezadoFormulario implements java.io.Serializable {

    private Area area;
    private Byte horas;
    private List<DetalleExtraccion> detalle = new ArrayList<>();

    public FormularioExtraccion() {
        super.setTipo(TIPO_FORMULARIO_CORTA);
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

    public List<DetalleExtraccion> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleExtraccion> detalle) {
        this.detalle = detalle;
    }
 
}
