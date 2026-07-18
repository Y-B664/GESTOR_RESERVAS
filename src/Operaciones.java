import java.util.Scanner;

public class Operaciones {

    static final int MAX = 10;
    static int contador = 0;
    static String[] clientes = new String[MAX];
    static int[] horas = new int[MAX];
    static int[] servicios = new int[MAX];

    static void agendar(Scanner sc){
        if(contador == MAX){
            System.out.println("No hay cupos para mas reservas.");
            return;
        }
        String cliente;
        int hora;
        int servicio;
        do{
            System.out.print("Ingrese el nombre del cliente:");
            cliente = sc.nextLine();
        }while(Validador.nombreValido(cliente)==false);
        do{
            System.out.print("Ingrese la hora de la reserva, el horario es de 8 am a las 18(6)pm.");
            hora = Validador.numeroEntero(sc);
        }while(Validador.horaValida(hora)==false || Validador.numeroExiste(hora, horas));
        do{
            System.out.print("Ingrese el servicio:");
            servicio = Validador.numeroEntero(sc);
        }while(Validador.servicioValido(hora)==false);
        clientes[contador]=cliente;
        horas[contador]=hora;
        servicios[contador]=servicio;
        contador++;
    }

    static void listar(){
        if(contador==0){
            System.out.println("Aun no se ha solicitado ninguna reserva :)");
            return;
        }
        System.out.println("RESERVAS AGENDADAS: " + contador);
        System.out.println("| COD |  CLIENTE  |  HORA  |    SERVICIO    |");
        for(int i = 0 ; i<contador;i++){
            System.out.printf("| %d | %S | %D:00 | %S |",(i+1),clientes[i],horas[i],identificarServicio(servicios[i]));
        }
    }

    static String identificarServicio(int codigo){  
        return switch (codigo) {
            case 1 -> "Corte de cabello";
            case 2 ->  "Tinte";
            case 3 ->  "Manicure";
            default ->  "No disponible";
        };
    }
    static void cancelar(Scanner sc){
        System.out.println("Digite la reserva a cancelar segun su codigo.");
        listar();
        int codigo = sc.nextInt();
        if (codigo<1 || codigo>contador) {
            System.out.println("Codigo no valido.");
            return;
        }
        



    }

}
