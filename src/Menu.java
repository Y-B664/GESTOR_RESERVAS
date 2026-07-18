import java.util.Scanner;

public class Menu {

    static void mostrar(){
        System.out.println("\n --------- MENU ---------");
        System.out.println("| 1. Agendar una reserva. |");
        System.out.println("| 2. Listar reservas.     |");
        System.out.println("| 3. Cancelar una reserva.|");
        System.out.println("| 4. Ver reporte del dia. |");
        System.out.println("| 5. Buscar por cliente.  |");
        System.out.println("| 6. Editar hora reserva. |");
        System.out.println("| 7. Horarios disponibles.|");
        System.out.println("| 8. Servicio mas pedido. |");
        System.out.println("| 9. Cerrar turno/Salir   |");

        System.out.println("---------------------------");
    }

    static int leerOpcion(Scanner sc){
        System.out.println("Por favor digite su opcion:");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

}
