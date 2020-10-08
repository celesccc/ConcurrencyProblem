package com.company;

//Clase que simula el dinero que sacamos:

public class ThreadWithdrawCash extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Simulamos la lectura del saldo del cliente (conexión on-line)");
            int cashOriginal = FakeDB.cash; // Variable que tiene el dinero que había
            System.out.println("El saldo del cliente es " + cashOriginal);
            long sleepingTime = (long) (Math.random()*1000); // Tiempo de espera
            sleep(sleepingTime);
            //El usuario va a sacar dinero:
            int cash = cashOriginal -10;

            //Antes de actualizar sleep porque tarda en hacerlo:
            sleep(sleepingTime);
            //Actualizamos el dinero que le queda:
            System.out.println("Simulamos la escritura del saldo del cliente, ha sacado " + 10 + " monedas.");
            System.out.println("Nuestro hilo se piensa que en la FakeBD había " + cashOriginal + " pero realmente hay " + FakeDB.cash);
            FakeDB.cash = cash;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Imprimimos lo que nos queda:
        System.out.println("El resultado guardado en la base de datos es " + FakeDB.cash);
    }
}
