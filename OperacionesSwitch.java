public interface OperacionesSwitch {
    public static void main(String args[]){
        int num_uno = 5, num_dos = 3;
        float result = 0.0f;
        int parametro = 4;

        switch(parametro){
            case 1: result = num_dos + num_uno;
                    System.out.println("El resultado de la suma es: " + result);
                    break;
            
            case 2: result = num_uno - num_dos;
                    System.out.println("El resultado de la resta es: "  + result);
                    break;

            case 3: result = num_uno * num_dos;
                    System.out.println("El resultado de la multiplicacion es: "  + result);
                    break;

            case 4: result = (float) num_uno / num_dos; 
                    System.out.println("El resultado de la diviions es: "  + result);
                    break;
            
            default: System.out.println("Error, la opción no existe");
        }
    }
}
