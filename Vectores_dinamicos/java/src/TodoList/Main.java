package TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void caso1(ArrayList<Lista> todoList, Scanner sc){
        System.out.println("TO DO LIST: ");
        System.out.print("NomTarea: ");
        String nomTask=sc.nextLine();
        System.out.print("Autor: ");
        String nomAutor=sc.nextLine();
        System.out.print("Descripción: ");
        String desc=sc.nextLine();
        System.out.print("Duración: ");
        double durMinutos =sc.nextDouble();
        sc.nextLine();
        System.out.print("Descripción: ");
        String estado =sc.nextLine();
        todoList.add(new Lista(nomTask,nomAutor,desc,durMinutos,estado));
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lista> todoList = new ArrayList<>();
        boolean start=true;
        while (start){
            System.out.println();
            System.out.print("QUE HACEMOS HOY?"+"\n1.Agregar tarea "+ "\n2.Ver tareas"+"\nRpta: ");
            int comenzar=sc.nextInt();
            sc.nextLine();
            switch (comenzar){
                case 1:
                    caso1( todoList, sc);
                    break;
                case 2:
                    if (todoList.isEmpty()){
                        System.out.println("No hay tareas pendientes");
                    } else {
                        for (Lista p:todoList){
                            System.out.println(p);
                        }
                    }
                    break;
            }

        }

    }
}
