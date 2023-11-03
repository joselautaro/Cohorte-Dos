package Clase5;

import javax.swing.JOptionPane;

public class Clase5 {

    public static void main(String[] args) {
        /*
        //Primer ejemplo de algoritmo simple
        //Solicitar al usuario que ingrese el primer número y guardarlo en una variable
        
        String num1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        
        //Solicitar el segundo dato
        
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        
        //Tenemos que resolver algo, que se llama parseo
        
        //Convertir las cadenas a números y realizar una suma
        
        double resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
        
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
         */
 /*
        //Segundo ejemplo de algoritmo
        //Solicitar al usuario un dato
        String calificacion = JOptionPane.showInputDialog("Ingrese la calificación del estudiante");

        //Convertir la cadena de texto a un numero entero
        int nota = Integer.parseInt(calificacion);

        //Comprobamos si es mayor o igual a 70
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Desaprobado, nos vemos en Diciembre");
        }
         */
 /*
         //ejemplo 3
         //Solicitar al usuario la base y altura del triangulo y guardar en una variable
         
         String baseString = JOptionPane.showInputDialog("Ingrese la base del triángulo");
         
         String alturaString = JOptionPane.showInputDialog("Ingresar la altura del triangulo");
         
         //Convertimos cadenas a números de punto flotante
         double base = Double.parseDouble(baseString);
         
         double altura = Double.parseDouble(alturaString);
         
         //Calcular el area del triángulo
         
         double area =  2 / base * altura;
         
         JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
         */
 /*
        //Ejemplo 4
        
        String numeroString = JOptionPane.showInputDialog("Ingrese un número");
        
        //Convertimos el dato de arriba
        int numero = Integer.parseInt(numeroString);
        
        //Determinamos si el número es positivo, negativo o cero
        if( numero > 0 ){
            JOptionPane.showMessageDialog(null, "El número es positivo");
        }else if( numero < 0 ){
            JOptionPane.showMessageDialog(null, "El número es negativo");
        }else{
            JOptionPane.showMessageDialog(null, "El número es cero");
        }
         */
 /*
        //Ejemplo 5
        //int numero = JOptionPane.showInputDialog("Ingresa un número");
        //int numero = Integer.parseInt(input) ;
        //String numeroString = JOptionPane.showInputDialog("Ingresa un número");
        //int numero = Integer.parseInt(numeroString);
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        //Comprobar si el numero es par o impar
        if (nro % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
         */
 
         //Ejemplo 6
         
         String numeroUno = JOptionPane.showInputDialog("Ingrese un número");
         
         String numeroDos = JOptionPane.showInputDialog("Ingrese un número");
         
         String numeroTres = JOptionPane.showInputDialog("Ingrese un número");
         
         //Inicializar una variable para almacenar el numero mayor
         
         double mayor = Double.parseDouble(numeroUno);
         
         //Comprobar si el segundo número es mayor que el actual numero mayor
         if( Double.parseDouble(numeroDos) > mayor ){
             mayor = Double.parseDouble(numeroDos);
         }
         //Comprobando si el tercer numero es mauor que el actual numero mayor
         if( Double.parseDouble(numeroTres) > mayor ){
             mayor = Double.parseDouble(numeroTres);
         }
         JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
         
 
 

    }

}
