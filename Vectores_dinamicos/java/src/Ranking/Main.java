package Ranking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void añadirPreguntas(List<Pregunta> bancoTotal){
        bancoTotal.add(new Pregunta("¿Cuál es el lugar más frío de la Tierra?", "La Antártida", "Rusia", "Groenlandia", "El Polo Norte"));
        bancoTotal.add(new Pregunta("¿Quién escribió 'Cien años de soledad'?", "Gabriel García Márquez", "Mario Vargas Llosa", "Isabel Allende", "Pablo Neruda"));
        bancoTotal.add(new Pregunta("¿Cuál es el río más largo del mundo?", "Amazonas", "Nilo", "Misisipi", "Danubio"));
        bancoTotal.add(new Pregunta("¿En qué continente está el desierto del Sahara?", "África", "Asia", "Oceanía", "América"));
        bancoTotal.add(new Pregunta("¿Cuál es el símbolo químico del oro?", "Au", "Ag", "Fe", "Or"));
        bancoTotal.add(new Pregunta("¿Qué planeta es conocido como el planeta rojo?", "Marte", "Júpiter", "Saturno", "Venus"));
        bancoTotal.add(new Pregunta("¿Cuál es el océano más grande?", "Pacífico", "Atlántico", "Índico", "Ártico"));
        bancoTotal.add(new Pregunta("¿Cuántos huesos tiene el cuerpo humano adulto?", "206", "201", "210", "195"));
        bancoTotal.add(new Pregunta("¿Quién pintó 'La última cena'?", "Leonardo da Vinci", "Miguel Ángel", "Rafael", "Donatello"));
        bancoTotal.add(new Pregunta("¿Cuál es el país más grande del mundo?", "Rusia", "Canadá", "China", "EE.UU."));
    }
    public static void printBienvenida(){
        System.out.println("========================================");
        System.out.println("   BIENVENIDO AL RANKING TRIVIA");
        System.out.println("========================================\n");
    }
    public static void mostrarRankingFinal() {
        System.out.println("\n========================================");
        System.out.println("       RANKING FINAL DEL JUEGO");
        System.out.println("========================================");
        if (mapaRanking.isEmpty()) {
            System.out.println("No hubo jugadores en esta sesión.");
        } else {
            for (Jugador j : mapaRanking.values()) {
                System.out.println("• " + j.getNomJugador() + " --- Puntaje: " + j.getPuntuacion() + " pts");
            }
        }
        System.out.println("========================================\n");
    }
    private static HashMap<String, Jugador> mapaRanking = new HashMap<>();

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<Pregunta> bancoTotal= new ArrayList<>();
        boolean jugar = true;

        while (jugar) {
            List<Pregunta> bancoTotal = new ArrayList<>();
            añadirPreguntas(bancoTotal);
            printBienvenida();

            System.out.print("Nombre del nuevo jugador (o escribe 'salir' para cerrar): ");
            String nombreUsuario = sc.nextLine();

            Jugador jugadorActual = new Jugador(nombreUsuario, 0);
            int puntajePartida = 0;

            for (int i = 0; i < bancoTotal.size(); i++) {
                Pregunta p = bancoTotal.get(i);
                System.out.println("\n" + (i + 1) + ". " + p.getEnunciado());

                List<String> opciones = p.getOpciones();
                for (int j = 0; j < opciones.size(); j++) {
                    System.out.println("   " + (j + 1) + ". " + opciones.get(j));
                }

                System.out.print("Respuesta: ");
                int seleccion = sc.nextInt();
                sc.nextLine();

                if (p.esCorrecta(seleccion)) {
                    System.out.println("¡Correcto!");
                    puntajePartida += 10;
                } else {
                    System.out.println("Incorrecto. Era: " + p.getRespuestaCorrecta());
                }
            }

            jugadorActual.setPuntuacion(puntajePartida);
            mapaRanking.put(nombreUsuario, jugadorActual);
            System.out.println("\n>>> Partida finalizada para " + nombreUsuario + ". Puntos: " + puntajePartida);

            System.out.println("\n¿Deseas que otro jugador participe?");
            System.out.println("1. Sí (Jugar de nuevo)");
            System.out.println("2. No (Ver ranking y salir)");
            System.out.print("Opción: ");
            int opcionSalida = sc.nextInt();
            sc.nextLine();

            if (opcionSalida == 2) {
                jugar = false;
            }
        }

        // Paso E: Mostrar el ranking UNA SOLA VEZ al salir del bucle
        mostrarRankingFinal();

        System.out.println("Cerrando sistema... ¡Hasta pronto!");
        sc.close();



    }
}
