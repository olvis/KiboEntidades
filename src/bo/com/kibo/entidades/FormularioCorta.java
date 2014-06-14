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
public class FormularioCorta
        extends EncabezadoFormulario
        implements java.io.Serializable, IFormularioPostCenso {

    private Area area;
    private Byte horas;
    
    private List<DetalleCorta> detalle = new ArrayList<>();

    public FormularioCorta() {
        super.setTipo(EncabezadoFormulario.TIPO_FORMULARIO_CORTA);
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
    public List<DetalleCorta> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleCorta> detalle) {
        this.detalle = detalle;
    }

    @Override
    public Integer getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

}
