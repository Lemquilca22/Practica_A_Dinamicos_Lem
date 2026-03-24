package MiniRedSocial;

import Carrito.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Post>> mapaPost = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nombre de usuario: ");
        String nomuser=sc.nextLine();
        System.out.print("Correo: ");
        String correo=sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasenia=sc.nextLine();

        Usuario user1=new Usuario(nomuser,correo,contrasenia);
        Post primerPost = new Post("Mi primera foto", nomuser, "url_de_la_foto.jpg");
        user1.getPublicaciones().add(primerPost);
        Post segundopost = new Post("Mi segunda foto", nomuser, "url_de_la_foto.jpg");
        user1.getPublicaciones().add(segundopost);

        mapaPost.put(user1.getNomUser(),user1.getPublicaciones());

        System.out.println("\n========================================");
        System.out.println("       POSTS DE: "+user1.getNomUser());
        System.out.println("========================================");
        if (mapaPost.isEmpty()) {
            System.out.println("El sistema no tiene usuarios registrados.");
        } else {
            for (ArrayList<Post> listaDeCadaUsuario : mapaPost.values()) {
                //Se usan bucles anidados, ya que en mis Hashmap tiene un array de objetos y para mostrarlo no puedo mostrar las listas
                //Quiero mostrar lo que está dentro de estas.
                if (listaDeCadaUsuario.isEmpty()) {
                    System.out.println("El usuario existe, pero no tiene posts todavía.");
                } else {
                    //
                    for (Post j : listaDeCadaUsuario) {
                        System.out.println("• " + j.getNomPost() + " --- Autor: " + j.getAutor() + " --- Foto: " + j.getFoto());
                    }
                }
            }
        }
    }
}
