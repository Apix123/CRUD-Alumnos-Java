import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        System.out.println("Menu CRUD");//--Escribo el menu para visualizarlo en la consola.
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Mostrar Alumno");
        System.out.println("3. Salir");
        System.out.println("Elegir una opcion: ");

        Scanner scanner = new Scanner(System.in);//--Declaro un objeto escaner para leer entradas.
        int opcion = scanner.nextInt(); //---Declaro variable para que se guarde el valor declarado por el usuario.

        System.out.println("Elegiste la opcion: " + opcion);//--Mensaje donde indica que opcion elegiste
        
        switch (opcion){//--Declarando los mensajes a mostrar dependiendo de la opcion a escribir.
            case 1:
                System.out.println("Agregar Alumno");
                ArrayList<String> Agregar = ArrayList<>();
                Agregar.add()
                break;
            case 2:
                System.out.println("Mostrar Alumnos");
                break;
            case 3:
                System.out.println("Salir del Sistema");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }
}
