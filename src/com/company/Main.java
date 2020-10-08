package com.company;

public class Main {

    public static void main(String[] args) {
	    // Obtener dinero:
        // Si realiza la operación muchas veces, se lanzan varios hilos:
        try {
            ThreadWithdrawCash t1 = new ThreadWithdrawCash();
            t1.start();
            t1.join();
            ThreadWithdrawCash t2 = new ThreadWithdrawCash();
            t2.start();
            t2.join();
            ThreadWithdrawCash t3 = new ThreadWithdrawCash();
            t3.start();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
