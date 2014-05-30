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
public class Area extends GeoLugar implements java.io.Serializable {

    //Este es un comentario
    private String codigo;
    private Short anioInicial;
    private Short anioFinal;
    private Byte zonaUTM;
    private String bandaUTM;
    
    //imbesil...

    public Area() {
        super.setTipo(TIPO_AREA);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Short getAnioInicial() {
        return anioInicial;
    }

    public void setAnioInicial(Short anioInicial) {
        this.anioInicial = anioInicial;
    }

    public Short getAnioFinal() {
        return anioFinal;
    }

    public void setAnioFinal(Short anioFinal) {
        this.anioFinal = anioFinal;
    }

    public Byte getZonaUTM() {
        return zonaUTM;
    }

    public void setZonaUTM(Byte zonaUTM) {
        this.zonaUTM = zonaUTM;
    }

    public String getBandaUTM() {
        return bandaUTM;
    }

    public void setBandaUTM(String bandaUTM) {
        this.bandaUTM = bandaUTM;
    }

}
