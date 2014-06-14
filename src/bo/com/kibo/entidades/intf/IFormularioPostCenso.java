/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.com.kibo.entidades.intf;

import bo.com.kibo.entidades.Area;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Olvinho
 */
public interface IFormularioPostCenso {
    Integer getId();
    
    Area getArea();
    
    Byte getHoras();
    
    Date getFecha();
    
    List getDetalle();
    
}
