import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
            switch (opcion) {
            case 1 -> Operaciones.agendar(sc);
            case 2 -> Operaciones.listar();
            case 3 -> Operaciones.cancelar(sc);
            case 4 -> Operaciones.reporte();
            case 5 -> Operaciones.buscarPorCliente(sc);
            case 6 -> Operaciones.editarHoraReserva(sc);
            case 7 -> Operaciones.horarios();
            case 8 -> Operaciones.servicioMasPedido();
            case 9 -> System.out.println("Gracias por utilizar el programa, has cerrado tu turno.");
        }
        }while(opcion!=9);
        
        sc.close();
    }
}
