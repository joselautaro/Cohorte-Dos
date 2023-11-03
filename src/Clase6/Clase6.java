package Clase6;

import javax.swing.JOptionPane;

public class Clase6 {

    public static void main(String[] args) {
        /*
        //Ejemplo 1
            //Declarar un vector de enteros
            
            int[] vector = {1, 2, 3, 4, 5};
            
            //inicializamos una variable para almacenar la suma
            int suma = 0;
            
            //Recorrer el vector y sumar todos los elementos que tenemos
            
            for( int i = 0; i < vector.length;  i++){
                suma += vector[i];
            }
            //mostramos la suma de los resultados en el vector
            JOptionPane.showMessageDialog(null, "La suma de los elementos en el vector es: " + suma);          
         */
 /*
        //Ejemplo 2 - Encontrar el valor máximo de un vector
        int[] vector = {150, 666, 987, 265};

        //Inicializar una variable para encontrar el valor máximo 
        int maximo = vector[0];

        //Recorrer el vector para encontrar el valor máximo
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }

        }
        JOptionPane.showMessageDialog(null, "El valor máximo en el vector es: " + maximo);
         */

        //Ejemplo 3 - Multiplicación de una matriz por escalar
        //Declarar una matriz de enteros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Declarar un escalar
        int escalar = 2;

        //Recorrer la matriz y multiplicar cada elemento por el escalar
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] * escalar;
            }

        }
        //Imprimimos la matriz resultante
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }

        }
        
        
        

    }

}
