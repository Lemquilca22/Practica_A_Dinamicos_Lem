package Carrito;

public class Producto {
    private String nomProducto;
    private int cantProducto;

    public Producto(String nomProducto, int cantProducto) {
        this.nomProducto = nomProducto;
        this.cantProducto = cantProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
}
