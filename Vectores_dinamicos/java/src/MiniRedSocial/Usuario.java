package MiniRedSocial;

import java.util.ArrayList;

public class Usuario {
    private String nomUser;
    private String correo;
    private String contrasenia;
    private ArrayList<Post> publicaciones;

    public Usuario(String nomUser, String correo, String contrasenia) {
        this.nomUser = nomUser;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.publicaciones = new ArrayList<>();
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public ArrayList<Post> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Post> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
