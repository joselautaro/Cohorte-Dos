package Clase_11;


public class Estudiantes extends Persona{
    
   private String materiasCursando;
   
   private int legajo;
   
   private String carrera;
   
   public Estudiantes(String nombre, String apellido, int edad, String materiasCursando, int legajo, String carrera){
       super(nombre, apellido, edad);
       this.materiasCursando = materiasCursando;
       this.legajo = legajo;
       this.carrera = carrera;
   }
   
   public void mostrarDatos(){
       System.out.println("Nombre: " + getNombre() +  "\nApellido: " + getApellido() + "\nMaterias cursando: " + materiasCursando 
               + "\nLegajo: " + legajo
       + "\nCarrera en curso: " + carrera);
   }
   
    
}
