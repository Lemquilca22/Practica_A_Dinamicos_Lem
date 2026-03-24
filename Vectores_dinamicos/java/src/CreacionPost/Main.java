package CreacionPost;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void jsonupload(String json, String ip, String puerto){

        try {
            String urlCompleta = "http://" + ip + ":" + puerto + "/api/posts";
            URL url = new URL(urlCompleta);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);


            // Enviar el JSON
            try (OutputStream os = conn.getOutputStream()) {
                os.write(json.getBytes());
                os.flush();
            }

            // Recibir respuesta
            int respuesta = conn.getResponseCode();
            if (respuesta == 200) {
                System.out.println("Enviado");
            } else {
                System.out.println("Error " + respuesta);
            }


            conn.disconnect();

        } catch (Exception e) {
            System.out.println(" Error al conectar: " + e.getMessage());
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("Autor: ");
        String autor=sc.nextLine();
        System.out.print("Url: ");
        String enlace=sc.nextLine();
        Post p1=new Post(nombre,autor,enlace);

        String ip = "192.168.8.43";
        String puerto= "8080";
        jsonupload(p1.toString(),ip,puerto);


    }
}
