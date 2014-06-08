/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import bo.com.kibo.entidades.intf.ISincronizable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Olvinho
 */
public class GeoLugar implements java.io.Serializable, ISincronizable {

    public static byte TIPO_AREA = 0;
    public static byte TIPO_FAJA = 1;
    public static byte TIPO_PATIO = 2;
    
    private Integer id;
    private Date modificado;
    private byte tipo;
    private List<PuntoXY> poligono = new ArrayList<>();
            

    public GeoLugar() {
    }

    public GeoLugar(Integer id, Date modificado, byte tipo) {
        this.id = id;
        this.modificado = modificado;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public List<PuntoXY> getPoligono() {
        return poligono;
    }

    public void setPoligono(List<PuntoXY> poligono) {
        this.poligono = poligono;
    }
    
}
