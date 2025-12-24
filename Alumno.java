public class Alumno { //--Clase Alumno para declarar variables a requerir para el CRUD
    private int id; 
    private String name; 
    private int age;

//--Declaro Constructor para almacenar los datos de las variables.
public Alumno(int id, String name, int age) {
    this.id = id; 
    this.name = name; 
    this.age = age; 
}

@Override //--indicando que esta sobreescribiendo
public String toString() {
    return "ID: " + id + "\n"
         + "Nombre: " + name + "\n" 
         + "Edad: " + age + "\n";
}

public int getId(){
    return id;
}

}