import java.util.Scanner;
public class Sistema {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;

        System.out.println("***********************************************");
        System.out.println("*Bienvenido al sistema vacacional de Company*");
        System.out.println("***********************************************");
        System.out.println("");

        System.out.println("¿Cuál es el nombre del trabajador?!");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.println("¿Cuanto tiempo de servicio tiene el trabajador?!");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("¿Cuál es la clave del  trabajador?!");
        clave = entrada.nextInt();
        System.out.println("");

        if(clave == 1){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 12 días de vacaiones" );
            }else if (antiguedad>= 2 && antiguedad<=6){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 16 días de vacaiones" );
            }else if(antiguedad >=7){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 20 días de vacaiones" );
            }
        } else if (clave == 2){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 14 días de vacaiones" );
            }else if (antiguedad>= 2 && antiguedad<=6){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 18 días de vacaiones" );
            }else if(antiguedad >=7){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 24 días de vacaiones" );
            }

        }else if (clave ==3){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 16 días de vacaiones" );
            }else if (antiguedad>= 2 && antiguedad<=6){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 20 días de vacaiones" );
            }else if(antiguedad >=7){
                System.out.println("El trabajador " + nombre + "tiene derecho  a 28 días de vacaiones" );
            }

        } else {
            System.out.println("Error la clave de departamento es incorrecta");
        }

    }
}
