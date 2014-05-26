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
public class RolPermisoId implements java.io.Serializable {

    private int idPermiso;
    private int idRol;

    public RolPermisoId() {
    }

    public RolPermisoId(int idPermiso, int idRol) {
        this.idPermiso = idPermiso;
        this.idRol = idRol;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof RolPermisoId)) {
            return false;
        }
        RolPermisoId castOther = (RolPermisoId) other;

        return (this.getIdPermiso() == castOther.getIdPermiso())
                && (this.getIdRol() == castOther.getIdRol());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdPermiso();
        result = 37 * result + this.getIdRol();
        return result;
    }

}
