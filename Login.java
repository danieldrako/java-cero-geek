import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String usuario = "", password = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Ingresa  tu contraseña: ");
        password= entrada.nextLine();

        if( usuario.equals("Daniel") && password.equals("12345678") ){
            System.out.println("Inicia de sesion correcto");

        }else {
            System.out.println("Nombre de usuario o contraseña incorrectos");

        }

    }
}
