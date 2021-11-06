package actividadjavacodoacodo;

import java.util.Scanner;

public class ActividadJavaCodoAcodo {

    public static void main(String[] args) {

        String nombre;
        String apellido;
        String hobbie;
        String editorDeCodigoPreferido;
        String sistemaOperativo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = teclado.nextLine();
        System.out.println("Ingrese su hobbie:");
        hobbie = teclado.nextLine();
        System.out.println("Ingrese su editor de codigo preferido:");
        editorDeCodigoPreferido = teclado.nextLine();
        System.out.println("Ingrese el sistema operativo que utiliza:");
        sistemaOperativo = teclado.nextLine();

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi apellido es " + apellido);
        System.out.println("Mi hobbie es " + hobbie);
        System.out.println("Mi editor de codigo preferido es " + editorDeCodigoPreferido);
        System.out.println("El sistema operativo que utilizo es: " + sistemaOperativo);
    }
}
