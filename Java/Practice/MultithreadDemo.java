class toThread implements Runnable {

    Thread thread;

    toThread(String name) {
        thread = new Thread(this, name);
        System.out.println("Thread is created");
        thread.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child thread : " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

public class MultithreadDemo {
    public static void main(String[] args) {
        // toThread inThread = new toThread("Thread 1");
        new toThread("Thread 1");

        // inThread.thread.start();

        try {
            for(int i=1; i<=10; i++){
                System.out.println("Main thread : "+ i);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
