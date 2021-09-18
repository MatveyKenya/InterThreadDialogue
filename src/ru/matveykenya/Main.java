package ru.matveykenya;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Главный поток Старт!");
        ThreadGroup myThreadGroup = new ThreadGroup("My Group");

        MyThread myThread1 = new MyThread(myThreadGroup, "Игорек", 1500);
        MyThread myThread2 = new MyThread(myThreadGroup, "Петька", 3000);
        MyThread myThread3 = new MyThread(myThreadGroup, "Наташка", 2000);
        MyThread myThread4 = new MyThread(myThreadGroup, "Зинка", 1000);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        System.out.println("Главный поток Слип 15000");
        Thread.sleep(15000);
        System.out.println("Главный поток Проснулся и завершается!");

        myThreadGroup.interrupt();
    }
}
