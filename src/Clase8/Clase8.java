package Clase8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Clase8 {
    
    public static void main(String[] args){
        
        //HashMap básico:
        //Crear un hashMap, agregar elementos y mostrarlo
        
        Map<String, Integer> miMapa = new HashMap<>();
        
        //Agremos información a este mapa
        miMapa.put("Uno", 1);
        miMapa.put("Dos", 2);
        
        System.out.println("Ejemplo 1: " + miMapa);
        
        //ejemplo 2
        //Obtener el valor asociado a la clave dos
        int value = miMapa.get("Dos");
        System.out.println("value = " + value);
        
        //ejemplo3
        //Verificar si la clase "Tres" está presente en el mapa
        
        boolean containsKey = miMapa.containsKey("Tres");
       System.out.println("Ejemplo 3: ¿Contiene 'Tres'? " + containsKey);
        
       //Ejemplo4
       for( Map.Entry<String, Integer> entry : miMapa.entrySet()){
           System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
       }
       
       //Ejemplo 5:
      //LinkedHashMap:  es una implementación del Map que mantiene el orden
      //inserción de las claves. A diferencia del HashMap, donde no está ganratizado, Linked 
      //conserva el orden en que se insertaron las entradas
      
      Map<String, Integer> miLinked = new LinkedHashMap<>();
      miLinked.put("Tres", 3);
      miLinked.put("Cuatro", 4);
      
      System.out.println("Ejemplo 5: " + miLinked);
      
      //Ejemplo 6
      //Utilizar un TreeMap para ordenar las claves de manera natural
      //TreeMap, es una implementación de la interfaz que ordena las claves de forma natural
      //o mediante un comparador personalizado, a diferencia del hashmap y linkedhashmap las claves
      //en un treemap están ordenadas
      
      Map<String, Integer> miTree = new TreeMap<>();
        System.out.println("miTree = " + miTree);
        
        
        //Ejemplo 7
        miMapa.remove("Dos");
        System.out.println("Ejemplo 7 después de remover el 'Dos' " + miMapa);
        
        miMapa.replace("Uno", 15);
        System.out.println("Ejemplo 9 después de reemplazar 'Uno' " + miMapa);
    }
    
    //Ejercicios 1: tomar el mapa miMapa y remover un item
    //Ejercicio 2: tomar el mapa miMapa y reemplazar un item
    //Ejercicio para mañana: Verificar si el mapa está vacio después de eliminar todas las entradas
    
    
}
