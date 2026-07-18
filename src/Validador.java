import java.util.Scanner;

public class Validador {

    static boolean horaValida(int hora){
        if(hora>=8 && hora<=18){
            return true;
        }
        System.out.println("Hora no valida.");
        return false;
    }

    static boolean nombreValido(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            return true;
        }
        System.out.println("Nombre no valido.");
        return false;
    }

    static boolean servicioValido(int opcion){
        if(opcion>0 && opcion<4){
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
                System.out.print("El valor ingresado no es un numero entero, ingrese de nuevo: ");
                sc.nextLine();
            }
        }
    }

    static boolean reservaExiste(int hora, int[] horas,String mensaje){
        for(int i = 0; i<horas.length;i++){
            if(hora == horas[i]){
                System.out.println(mensaje);
                return true;
            }
        }
        
        return false;
    }
    static boolean clienteExiste(String cliente, String[]clientes){
        for(int i = 0; i<clientes.length;i++){
            if(cliente == clientes[i]){
              //  System.out.println(mensaje);
                return true;
            }
        }
        return false;
    }

    static boolean noCitas(int contador){
        if(contador==0){
            
            System.out.println("____________________________________________________");
            System.out.println("!!!!!Aun no se ha solicitado ninguna reserva :)!!!!");
            System.out.println("____________________________________________________");

            return true;
        }
        return false;
    }




}
