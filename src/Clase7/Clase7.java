package Clase7;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;


public class Clase7 {
    
    public static void main(String[] args) {
        /*
            Las colecciones son un conjunto de clases e interfaces que proporcionan
        estructuras de datos para almacenar, organizar y manipular datos de manera
        eficiente.
        
        Hay varias clases de colecciones en java, pero las pples son:
        
        1- List: una lista es una coleccion ordenada que permite elementos
        duplicados, algunas implementaciones comunes son: ArrayList y LinkedList
        
        2- Set: Un conjunto es una coleccion que no permite elementos duplicados
        Los más comunes son: HashSet, LinkedHashSet y TreeSet
        
        3- Map: Un mapa es una coleccion de pares clave-valor. Unos de ellos son:
        HashMap, LinkedHashMap, y TreeMap
        */
        
        //Ejemplo básico de List(ArrayList):

        //List: la clase que usamos
        //<String>: Declaramos el tipo de dato usaremos en el lista
        //miLista: el nombre de la lista
        //new: Palabra reservada que nos indica el tipo de implementación
        //ArrayList<>(): la implementación
        /*
        //Crear una lista
        List<String> miLista = new ArrayList<>();
    
        
        //Agregamos elementos a la lista con el método add
        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Frutilla");
        
        //Accedemos a elementos por indice
        //Con la palabra reservada get, obtenemos el indice
        String primeraFruta = miLista.get(0);
        System.out.println("Primera fruta: " + primeraFruta);
        
        //Iterar a travez de la lista
        for( String fruta : miLista ){
            System.out.println("Fruta: " + fruta);
        }
        */
        /*
        //Set
        //Crear un conjunto
        Set<String> miSet = new HashSet<>();
        
        //Agregamos elementos al conjunto
        miSet.add("Kiwi");
        miSet.add("Mandarina");
        miSet.add("Melón");
        
        //Iterar a travez del conjunto
        for ( String fruta : miSet ){
            System.out.println("Fruta: " + fruta);
        }
        */
        
        //Crear un mapa
        //map
        
        Map<String, Integer> miMapa = new HashMap<>();
        
        //Agregamos pares de clave-valor al mapa
        miMapa.put("Zapato", 9);
        miMapa.put("Remeras", 10);
        miMapa.put("Carteras", 7);
        
        //Acceder a un valor por clave
        int cantidadZapato = miMapa.get("Zapato");
        
        System.out.println("Cantidad de zapatos: " + cantidadZapato);
        
        //Iterar a través de las claves y valores del mapa y mostrarlos por consola
        //key
        for( String producto : miMapa.keySet() ){
            int cantidad = miMapa.get(producto);
            System.out.println("Productos: " + producto + "Cantidad: " + cantidad);
        }
      
    }
    
}
