package Carrito;

import Ranking.Jugador;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void printBienvenida(){
        System.out.println("========================================");
        System.out.println("   BIENVENIDO AL CARRITO DE COMPRA");
        System.out.println("========================================\n");
    }


    static void main(String[] args) {
        Producto pro1=new Producto("Leche",5);
        Producto pro2=new Producto("Huevos",12);
        Persona p1= new Persona("LEM");
        p1.getMapaProducto().put(pro1.getNomProducto(), pro1);
        p1.getMapaProducto().put(pro2.getNomProducto(), pro2);


        System.out.println("\n========================================");
        System.out.println("       TICKET DE: "+p1.getNomPersona());
        System.out.println("========================================");
        if (p1.getMapaProducto().isEmpty()) {
            System.out.println("No hay productos en el carrito.");
        } else {
            for (Producto j : p1.getMapaProducto().values()) {
                System.out.println("• " + j.getNomProducto() + " --- Cantidad: " + j.getCantProducto() + " unidades");
            }
        }
        System.out.println("========================================\n");
    }
}
