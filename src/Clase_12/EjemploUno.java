package Clase_12;

public class EjemploUno {

    public static void main(String[] args) {
        /*
        int numeroUno = 5;
        
        int numeroDos = 0;
        
        int resultado = numeroUno / numeroDos;
        
        System.out.println("resultado = " + resultado);
         */
        
        try{
            int resultado = 5/0;
            System.out.println(resultado);
        }catch( ArithmeticException e){
            System.out.println("Error: División por cero"+ e);
        }

    }

}
