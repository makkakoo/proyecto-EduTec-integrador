package modelo;

//Superclase B)

import java.io.File;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private int id_rol;
    private String nom_imagen;
    private File archivoFoto;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNom_imagen() {
        return nom_imagen;
    }

    public void setNom_imagen(String nom_imagen) {
        this.nom_imagen = nom_imagen;
    }

    public File getArchivoFoto() {
        return archivoFoto;
    }

    public void setArchivoFoto(File archivoFoto) {
        this.archivoFoto = archivoFoto;
    }

}
