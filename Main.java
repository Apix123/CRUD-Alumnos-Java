import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);//--Declaro un objeto escaner para leer entradas.
    ArrayList<Alumno> lista_alumnos = new ArrayList<>();//--Se crea el Array llamado lista_alumno basado de la clase Alumno.
    boolean salir = false;//--Declaro una variable para salir del ciclo while.
    int contadorId = 1;//--Declaro una variable para contar el ID de cada alumno registrado.

    while(!salir){

        System.out.println("Menu CRUD");//--Escribo el menu para visualizarlo en la consola.
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Mostrar Alumnos");
        System.out.println("3. Borrar Alumno");
        System.out.println("4. Editar Alumno");
        System.out.println("5. Salir del Sistema");
        System.out.println("Elegir una opcion: ");

        int opcion = scanner.nextInt(); //---Declaro variable para que se guarde el valor declarado por el usuario.

        System.out.println("Elegiste la opcion: " + opcion);//--Mensaje donde indica que opcion elegiste

        switch (opcion){//--Declarando los mensajes a mostrar dependiendo de la opcion a escribir.

            case 1:
                System.out.println("Agregar Datos de Alumno");//--Muestro el mensaje para indicar que se agregara alumnos.
                
                scanner.nextLine();//--Limpia buffer para el salto de linea.

                System.out.println("Escriba Nombre: ");
                String name = scanner.nextLine();
                
                int age = 0;//--Declaro la variable de la clase Alumno para leer parametro enteros.
                
                boolean edadValida = false;//--Declaro una variable para validar la edad del alumno.
                while(!edadValida)//--Ciclo para validar la edad del alumno.
                {
                    System.out.println("Escriba Edad: ");
                    String edadTexto = scanner.nextLine();//--Declaro una variable para leer la edad como texto y validar que sea un numero entero.
                    try{
                        age = Integer.parseInt(edadTexto);//--convertir el texto a un numero entero.
                        if(age > 0 && age <= 80){//--Condiciones para validar que la edad sea mayor a 0 y menor a 80.
                            edadValida = true;//--Si la edad es valida, entonces ya puede salir del ciclo while.
                        }else{
                            System.out.println("Numero fuera de rango, ingresar de nuevo.");
                        }
                        }
                    catch(NumberFormatException e){
                        System.out.println("No es un numero, ingresar de nuevo.");//--Mensaje para indicar que el valor no es valido y pedir que se ingrese de nuevo.
                    }
                }

                Alumno alumno = new Alumno(contadorId, name, age);//Declaro la variable(alumno), donde almacena los que se leyo anteriormente(id, name, age).
                lista_alumnos.add(alumno);//--Declaro el Array para almacenar la variable.
                System.out.println("Se agrego el alumno con ID: " + contadorId + " Nombre: " + name + " Edad: " + age);//--Mensaje para indicar que se agrego el alumno.
                contadorId++;//--Aumento el contador del ID para el siguiente alumno.
                break;

            case 2:
                System.out.println("Lista de Alumnos: ");

                if (lista_alumnos.isEmpty()) {
                    System.out.println("No hay alumnos registrados.");
                } else {
                    for (Alumno a : lista_alumnos) {
                        System.out.println("ID: " + a.getId() + //--Ciclo para mostrar la lista de alumnos registrados, donde se muestra el ID, nombre y edad de cada alumno.
                                          " Nombre: " + a.getName() +
                                          " Edad: " + a.getAge());
                    }
                }
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