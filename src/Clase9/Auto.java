package Clase9;

public class Auto {

    //Atributos == Características
    //Métodos == funciones
    //Declaramos los atributos de nuestro objeto
    String color;

    String marca;

    String modelo;

    //Esta es una instancia de nuestra clase auto con sus atributos dados
    public Auto(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Asignamos métodos == funciones
    public void encender() {
        System.out.println("El auto " + marca + " está encendiendo");
    }

    public void apagar() {
        System.out.println("El auto " + marca + " está apagado");
    }

}
