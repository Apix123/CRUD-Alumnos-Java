import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);//--Declaro un objeto escaner para leer entradas.
    ArrayList<Alumno> lista_alumnos = new ArrayList<>();//--Se crea el Array llamado lista_alumno basado de la clase Alumno.
    boolean salir = false;

    while(!salir){

        System.out.println("Menu CRUD");//--Escribo el menu para visualizarlo en la consola.
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Mostrar Alumno");
        System.out.println("3. Borrar Alumno");
        System.out.println("4. Editar Alumno");
        System.out.println("5. Salir del Sistema");
        System.out.println("Elegir una opcion: ");

        int opcion = scanner.nextInt(); //---Declaro variable para que se guarde el valor declarado por el usuario.

        System.out.println("Elegiste la opcion: " + opcion);//--Mensaje donde indica que opcion elegiste

        switch (opcion){//--Declarando los mensajes a mostrar dependiendo de la opcion a escribir.

            case 1:
                System.out.println("Agregar Datos de Alumno");//--Muestro el mensaje para indicar que se agregara alumnos.

                System.out.println("Escriba ID: ");//--Imprimo el mensaje para pedir datos.
                int id = scanner.nextInt();//--Declaro la variable de la clase Alumno para leer parametro enteros.

                scanner.nextLine();//--Limpia buffer para el salto de linea.

                System.out.println("Escriba Nombre: ");
                String name = scanner.nextLine();

                System.out.println("Escriba Edad: ");
                int age = scanner.nextInt();

                Alumno alumno = new Alumno(id, name, age);//Declaro la variable(alumno), donde almacena los que se leyo anteriormente(id, name, age).
                lista_alumnos.add(alumno);//--Declaro el Array para almacenar la variable.
                break;

            case 2:
                System.out.println("Lista de Alumnos: ");
                System.out.println(lista_alumnos);//--Imprimime la lista de Alumnos
                break;

            case 3:
                System.out.println("Proporciona ID para borrar Alumno: ");

                int eliminar_id = scanner.nextInt();//--Declaro una variable para leer lo que se escribe en la consola y buscar el ID del alumno.

                boolean encontrado = false;//--Se crea una variable donde le indico que el valor es falso para encontrar el ID del alumno.

                for(int i = 0; i < lista_alumnos.size(); i++){//--Se crea un ciclo FOR para leer la longitud de la lista para encontra el ID mediante la variable i.
                    if(lista_alumnos.get(i).getId() == eliminar_id){//--Un ciclo IF para poner una codicionante para encontrar el ID de que sea igual a la variable que se declaro par el numero del ID.
                        lista_alumnos.remove(i);//--Remover de la lista el numero de la variable i que coincidio con la variable "eliminar_id".
                        encontrado = true;
                        System.out.println("Alumno eliminado");
                        break;
                    }
                }

                if(!encontrado){//--otra condicionante IF para cuando no encuentre la ID
                    System.out.println("ID no encontrado");
                }
                break;
                
                case 4:

                    System.out.println("Proporciona ID para editar Alumno: ");
                    int idEdita = scanner.nextInt();
                    
                    scanner.nextLine();

                    boolean encontradoEdita = false;

                    for(int i = 0; i < lista_alumnos.size(); i++){
                        Alumno a = lista_alumnos.get(i);


                        if(a.getId() == idEdita){

                            lista_alumnos.set(i, lista_alumnos.get(i));

                            System.out.println("Ingrese el Nombre: ");
                            String nuevoName = scanner.nextLine();

                            System.out.println("Ingrese la Edad: ");
                            int nuevoAge = scanner.nextInt();

                            a.setName(nuevoName);
                            a.setAge(nuevoAge);

                            encontradoEdita = true;
                            System.out.println("Alumno actualizado correctmente");
                            break;
                        }
                    }

                    if(!encontradoEdita){
                        System.out.println("ID no encontrado");
                    }

                    break;

            case 5:
                System.out.println("Saliendo del Sistema");
                salir = true;//--Declaro que la variable "salir" sea verdadero para cerrar el While.
                break;
            default:
                System.out.println("Opcion Invalida");
            }
        }
    }
}