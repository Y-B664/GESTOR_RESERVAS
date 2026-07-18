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
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = sc.nextLine();
        }while(!Validador.nombreValido(cliente));
        do{
            System.out.print("Ingrese la hora de la reserva, el horario es de 8 am a las 18(6)pm: ");
            hora = Validador.numeroEntero(sc);
        }while(!Validador.horaValida(hora) || Validador.reservaExiste(hora, horas,"La hora ya esta reservada."));
        do{
            System.out.print("Ingrese el servicio: ");
            servicio = Validador.numeroEntero(sc);
        }while(!Validador.servicioValido(servicio));
        clientes[contador]=cliente;
        horas[contador]=hora;
        servicios[contador]=servicio;
        contador++;
        System.out.println("Cita agendada exitosamente!! ^_^");
    }

    static void listar(){
        if(Validador.noCitas(contador)){return;}
        System.out.println("---------------------------------------");
        System.out.println("       RESERVAS AGENDADAS: " + contador);
        System.out.println("---------------------------------------");

        System.out.println("| COD |");
        System.out.println("---------------------------------------");
        for(int i = 0 ; i<contador;i++){
            System.out.printf("|     |  NOMBRE  |   %s   \n",clientes[i]);
            System.out.printf("|  %d  |   HORA   |   %d:00   \n",(i+1),horas[i]);
            System.out.printf("|     | SERVICIO |   %s  \n",identificarServicio(servicios[i]));

            System.out.println("----------------------------------------");
            
        }
    }

    static void cancelar(Scanner sc){
        if(Validador.noCitas(contador)){return;}
        System.out.println("Digite la reserva a cancelar segun su codigo.");
        listar();
        int codigo = sc.nextInt();
        if (codigo<1 || codigo>contador) {
            System.out.println("Codigo no valido.");
            return;
        }
        contador--;
        for(int i= --codigo;i<contador;i++){
            clientes[i]=clientes[i+1];
            servicios[i]=servicios[i+1];
            horas[i]=horas[i+1];      
        }
    }

    static void reporte(){
        
        if(Validador.noCitas(contador)){return;}
        System.out.println("-----------------------------------------------");
        System.out.println("                REPORTE DEL DIA ");
        System.out.println("-----------------------------------------------");
        System.out.printf("Se han agendado %d citas.\n",contador);
        int total=0;
        for(int i=0;i<contador;i++){
            total+=identificarPrecioServicio(servicios[i]);
        }
        System.out.printf("El dia de hoy se ha facturado un total de $%d.\n",total);
        System.out.println("-----------------------------------------------");


    }

    static int identificarPrecioServicio(int codigo){  
        return switch (codigo) {
            case 1 -> 25000;
            case 2 ->  60000;
            case 3 ->  30000;
            default ->  0;
        };
    }
    static String identificarServicio(int codigo){  
        return switch (codigo) {
            case 1 -> "Corte de cabello";
            case 2 ->  "Tinte";
            case 3 ->  "Manicure";
            default ->  "No disponible";
        };
    }

    static void buscarPorCliente(Scanner sc){
        if(Validador.noCitas(contador)){return;}
        System.out.print("⌕ Digitar nombre a buscar: ");
        String cliente = sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println("           CITAS ");
        System.out.println("---------------------------------");
        for(int i = 0; i<contador;i++){
            if(cliente.equals(clientes[i])){
                System.out.printf("||  NOMBRE  |   %s   \n",clientes[i]);
                System.out.printf("||   HORA   |   %d:00   \n",(i+1),horas[i]);
                System.out.printf("|| SERVICIO |   %s   \n",identificarServicio(servicios[i]));
                System.out.println("---------------------------------------");

            }
        }
    }

    static void editarHoraReserva(Scanner sc){
        if(Validador.noCitas(contador)){return;}
        System.out.println("Digite la reserva a editar segun su codigo.");
        listar();
        System.out.print("Ingresar codigo: ");
        int codigo = sc.nextInt();
        if (codigo<1 || codigo>contador) {
            System.out.println("Codigo no valido.");
            return;
        }
        int hora;
        do { 
            System.out.print("Por favor ingrese la nueva hora o si desea cancelar digite -1: ");
            hora = Validador.numeroEntero(sc);
        } while (Validador.reservaExiste(hora, horas,"Esta hora ya esta reservada, intente otra por favor." ) || !Validador.horaValida(hora));

        horas[codigo-1]= hora;
    }

    static void horarios(){
        System.out.println( "-------------");
        System.out.println("|    HORAS    |");
        System.out.println("| DISPONIBLES |");
        System.out.println( "-------------");
        for(int i=8;i<19;i++){
            if(!Validador.reservaExiste(i, horas, "")){
                System.out.printf( "|    %d:00    |\n",i);
                System.out.println( "-------------");
            }
        }

    }

    static void servicioMasPedido(){
        if(Validador.noCitas(contador)){return;}
        int corte=0,tinte=0,manicure = 0;
        for(int i =0;i<contador;i++){
            switch (servicios[i]) {
                case 1 -> corte++;
                case 2 -> tinte++;
                case 3 -> manicure++;
                default ->System.out.println("Opcion invalida.");
            }
        }
        System.out.println("---------------------------------------------");
        if(corte > tinte && corte > manicure){
            System.out.println("El corte de cabello fue el servicio mas pedido.");
        }else if (tinte>corte && tinte >manicure) {
            System.out.println("El tinte fue el servicio mas pedido.");
        }else{
            System.out.println("El manicure fue el servicio mas pedido.");
        }
        System.out.println("---------------------------------------------");

    }

    

}
