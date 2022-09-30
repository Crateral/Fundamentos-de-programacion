package Tiempo;

import java.util.concurrent.TimeUnit;

public class Funcion
{
    //2. Crear una clase donde tenga 2 metodos implementados: Cronometro, temporizador.
    int hh, mm, ss;
    public void cronometro() throws InterruptedException {
        for (hh=0; hh<=23; hh++)
        {
            for (mm=0; mm<=59; mm++)
            {
                for (ss=0; ss<=59; ss++)
                {
                    System.out.println("Tiempo:" + hh + ":" + mm + ":" + ss);
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        }
    }

    public void temporizador(int minutos) throws InterruptedException {
        for (mm=minutos; mm>=0; mm--)
        {
            for (ss=59; ss>=0; ss--)
            {
                System.out.println("Tiempo:" + mm + ":" + ss);
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
