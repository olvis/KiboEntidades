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
public class Usuario implements java.io.Serializable {

    private Integer id;
    private Rol rol;
    private String nombre;
    private String contrasena;
    private String email;
    private String contrasenaDesencriptada;
   
    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;        
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenaDesencriptada() {
        return contrasenaDesencriptada;
    }

    public void setContrasenaDesencriptada(String contrasenaDesencriptada) {
        this.contrasenaDesencriptada = contrasenaDesencriptada;
    }
    
}
