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
public class Patio extends GeoLugar implements java.io.Serializable {

    private String nombre;
    private Area area;

    public Patio() {
        super.setTipo(TIPO_PATIO);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

}
