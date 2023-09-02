import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        String nombre_uno = "", nombre_dos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingresa ell primer nombre: ");
        nombre_uno = entrada.nextLine();

        System.out.println("Por favor ingresa el segundo nombre: ");
        nombre_dos = entrada.nextLine();

        if( nombre_uno.equalsIgnoreCase(nombre_dos) ){
            System.out.print("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }
    }
}
