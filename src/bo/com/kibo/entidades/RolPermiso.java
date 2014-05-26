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
public class RolPermiso implements java.io.Serializable {

    private RolPermisoId id = new RolPermisoId();
    private Rol rol;
    private Permiso permiso;
    private boolean valor;

    public RolPermiso() {

    }

    public RolPermiso(Rol rol, Permiso permiso, boolean valor) {
        this.rol = rol;
        this.permiso = permiso;
        this.id.setIdPermiso(permiso.getId());
        this.id.setIdRol(rol.getId());
        this.valor = valor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public RolPermisoId getId() {
        return id;
    }

    public void setId(RolPermisoId id) {
        this.id = id;
    }

}
