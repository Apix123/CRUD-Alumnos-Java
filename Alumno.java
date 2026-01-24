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

<<<<<<< HEAD
public void setName(String name){
    this.name = name;
}

public void setAge(int age){
    this.age = age;
}

=======
public void setAge(int nueva_edad) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setAge'");
}

public void setName(String nuevo_nombre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setName'");
}
>>>>>>> 052285b7beca62bcfec601ab1a406ebf6d0c7fd4
}