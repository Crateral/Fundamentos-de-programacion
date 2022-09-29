public class Reloj {

    public Reloj(){
    }

    public void cronometro(int condicion){

        switch (condicion){
            case 1:
                System.out.println("El cronometro inicio");
                break;
            case 2:
                System.out.println("El cronometro se pauso");
                break;
            case 3:
                System.out.println("El cronometro se detuvo");
                break;
            case 4:
                System.out.println("Salir");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }






}
