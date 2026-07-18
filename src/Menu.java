import java.util.Scanner;

public class Menu {

    static void mostrar(){
        System.out.println("--------MENU--------");
        System.out.println("1. Agendar una reserva.");
        System.out.println("2. Listar reservas.");
        System.out.println("3. Cancelar una reserva.");
        System.out.println("4. Ver reporte del dia.");
        System.out.println("5. Cerrar turno/Salir");
    }

    static int leerOpcion(Scanner sc){
        System.out.println("Por favor digite su opcion:");
        return sc.nextInt();
    }

}
