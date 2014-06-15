/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import java.util.Date;

/**
 *
 * @author Olvinho
 */
public class EncabezadoFormulario implements java.io.Serializable {

    public static final byte TIPO_FORMULARIO_CENSO = 0;
    public static final byte TIPO_FORMULARIO_CORTA = 1;
    public static final byte TIPO_FORMULARIO_EXTRACCION = 2;
    public static final byte TIPO_FORMULARIO_MOVIMIENTO = 3;

    private Integer id;
    private byte tipo;
    private Date fecha;

    public EncabezadoFormulario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
