package Carrito;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona {
    private String nomPersona;
    private  HashMap<String, Producto> mapaProducto;

    public Persona(String nomPersona) {
        this.nomPersona = nomPersona;
        this.mapaProducto= new HashMap<>();
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public HashMap<String, Producto> getMapaProducto() {
        return mapaProducto;
    }

    public void setMapaProducto(HashMap<String, Producto> mapaProducto) {
        this.mapaProducto = mapaProducto;
    }
}
