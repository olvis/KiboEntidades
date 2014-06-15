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
public class Carga implements java.io.Serializable, ISincronizable {

    private Integer id;
    private String codigo;
    private Date modificado;
    private boolean esRama;

    public Carga() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public boolean isEsRama() {
        return esRama;
    }

    public void setEsRama(boolean esRama) {
        this.esRama = esRama;
    }

}
