class newThread implements Runnable {
    Thread thread;
    String threadName;

    newThread(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, "Demo");
        System.out.println("Thread created successfully..");

        thread.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
         new newThread("t1");

        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
