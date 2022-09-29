import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite el Tiempo a temporizar en minutos");
        int guardarTempo=scanner.nextInt();
        Main main=new Main();
        main.temporizador(guardarTempo);
        int guardar=0;
        System.out.println("Digite una opcion");
        do{
            System.out.println(" 1.Iniciar\n 2.Pausar\n 3.Detenerse\n 4.Salir");
            guardar= (scanner.nextInt());
            Reloj reloj=new Reloj();
            reloj.cronometro(guardar);

        }while (guardar!=4);
    }

    public void temporizador(int tiempo){
        for (int i=0; i<=tiempo; i++ ){

            System.out.println(" "+i);
        }
        System.out.println("Tiempo finalizado.\n\n\n");
    }


}