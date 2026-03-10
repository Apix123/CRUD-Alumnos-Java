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

public int getId(){//--Metodo para obtener el ID del alumno
    return id;//--Retorna el valor del ID
}

public String getName(){//--Metodo para obtener el nombre del alumno
    return name;
}

public void setName(String name){//--Metodo para modificar el nombre del alumno
    this.name = name;
}

public int getAge(){//--Metodo para obtener la edad del alumno
    return age;
}

public void setAge(int age){//--Metodo para modificar la edad del alumno
    this.age = age;
}

}