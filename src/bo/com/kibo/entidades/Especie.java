/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.kibo.entidades;

import bo.com.kibo.entidades.intf.ISincronizable;
import java.util.Date;

/**
 *
 * @author Olvinho
 */
public class Especie implements java.io.Serializable, ISincronizable {

    private Integer id;
    private String nombre;
    private String cientifico;
    private float factor;
    private Float dmc;
    private Date modificado;

    public Especie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    public float getFactor() {
        return factor;
    }

    public void setFactor(float factor) {
        this.factor = factor;
    }

    public Float getDmc() {
        return dmc;
    }

    public void setDmc(Float dmc) {
        this.dmc = dmc;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

}
