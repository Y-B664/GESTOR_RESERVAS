import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
            switch (opcion) {
            case 1 -> System.out.println("En contruccion");
            case 2 -> System.out.println("En contruccion");
            case 3 -> System.out.println("En contruccion");
            case 4 -> System.out.println("En contruccion");
            case 5 -> System.out.println("Gracias por utilizar el programa, has cerado tu turno.");
        }
        }while(opcion!=5);
        
        sc.close();
    }
}
