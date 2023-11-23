package Clase_13;


public class Estudiantes extends Persona {
    
    private final String curso;
    
    public Estudiantes(String nombre, int edad, String curso){
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void saludar() {
       System.out.println("Hola soy " + getNombre() + " y  estudio en el curso de " + curso);
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy estudiante para el viaje a Punta Cana");
    }
    
    
    
}
