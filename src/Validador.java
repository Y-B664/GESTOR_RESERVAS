import java.util.Scanner;

public class Validador {

    static boolean horaValida(int hora){
        if(hora>=8 && hora<=17){
            return true;
        }
        System.out.println("Hora no valida.");
        return false;
    }
    static boolean nombreValido(String nombre){
        if(nombre != null && nombre.trim() !=null){
            return true;
        }
        System.out.println("Nombre no valido.");
        return false;
    }
    static boolean servicioValido(int opcion){
        if(opcion>0 & opcion<4){
            return true;
        }
        System.out.println("Servicio no valido");
        return false;
    }

    static int numeroEntero(Scanner sc){
        while (true) {
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            }else{
                System.out.println("El valor ingresado no es un numero entero.");
                sc.nextLine();
            }
        }
    }

    static boolean numeroExiste(int numero, int[] lista){
        for(int i = 0; i<lista.length;i++){
            if(numero == lista[i]){
                return true;
            }
        }
        System.out.println("El valor ingresado no existe.");
        return false;
    }


}
