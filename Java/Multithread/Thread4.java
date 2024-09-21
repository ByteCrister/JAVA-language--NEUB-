class myThread4 implements Runnable{
    Thread t;
    String name;

    myThread4(String name){
        this.name = name;
        t = new Thread(this,name);
        t.start();
    }

    public void run(){
        try {
            for(int i= 20; i>=1; i--){
                System.out.println(i+" Child thread : "+t);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class Thread4 {
    public static void main(String[] args) {
        new myThread4("One");
        new myThread4("Two");
        new myThread4("Three");

        try {
            for(int i=1; i<=20; i++){
                System.out.println("Main thread : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
