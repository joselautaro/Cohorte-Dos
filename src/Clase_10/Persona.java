package Clase_10;

//Creamos una clase que le dará sentido al objeto a construir, 
//debe tener el mismo nombre siempre que el objeto referenciado
public class Persona {
   
    
    //Encapsulamiento de atributos
    private int edad;
    
    //final, palabra reservada para nombrar una constante java
    private final String nombre;
    
    private double altura;
    
    public Persona(int edad, String nombre, double altura){
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
    }
    
    //Método setter: establecemos la edad
    public void setEdad( int edad ){
        this.edad = edad;
    }
    //Método getter: obtenemos la edad
    public int getEdad( ){
        return edad;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("La altura es: " + altura);
    }

    
}
