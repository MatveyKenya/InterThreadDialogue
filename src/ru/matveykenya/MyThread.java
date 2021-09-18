package ru.matveykenya;

public class MyThread extends Thread{

    private final int sleepTime;

    public MyThread(ThreadGroup group, String name, int sleepTime) {
        super(group, name);
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {

        try {
            while (!isInterrupted()) {
                sleep(sleepTime);
                System.out.println("Я поток " + getName() + " Всем привет!!!");
            }

        } catch (InterruptedException e) {
            //e.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", getName());
        }

    }
}
