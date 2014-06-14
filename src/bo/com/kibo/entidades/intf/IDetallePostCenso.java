/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.com.kibo.entidades.intf;

import bo.com.kibo.entidades.Calidad;
import bo.com.kibo.entidades.Carga;
import bo.com.kibo.entidades.Especie;
import bo.com.kibo.entidades.Patio;
import bo.com.kibo.entidades.Troza;

/**
 *
 * @author Olvinho
 */
public interface IDetallePostCenso {
    
    Troza getTroza();
    
    void setTroza(Troza troza);
    
    Carga getCarga();
    
    void setCarga(Carga carga);
    
    Especie getEspecie();
    
    void setEspecie(Especie especie);
    
    Patio getPatio();
    
    Float getDmayor();
    
    Float getDmenor();
    
    Float getLargo();
    
    Calidad getCalidad();
    
    void setCalidad(Calidad calidad);
    
}
