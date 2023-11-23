package Clase_14_Bis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        //Creamos una lista de autos
        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(new Auto("Fiat", "Uno"));
        listaAutos.add(new Auto("Gol","Trend"));
        listaAutos.add(new Auto("Chevrolet","Corsa"));
        listaAutos.add(new Auto("Chevrolet","Corvette"));

        //Uso de Strems para filtrar autos y mostrar los que estén en marca
        System.out.println("Autos en marcha: ");
        listaAutos.stream()
                .filter(Auto::isEnMarcha) //Filtramos por autos en marcha
                .forEach(System.out::println); //Mostrar cada auto en marcha
        
        //Cambiar el estado (enMarcha) de todos los autos a true usando Streams
        System.out.println("\nArrancando todos los autos...");
        listaAutos.stream()
                .forEach(auto -> auto.setEnMarcha(true));
        
        //Mostrar todos los autos despues de arrancarlos
        System.out.println("\nEstado de todos los autos después de arrancar:");
        listaAutos.forEach(System.out::println);
                
    }
    
}
