class Thread1{
    public static void main(String[] args) {

        Thread th = Thread.currentThread();
        th.setName("My thread");

        System.out.println(th);

        try{
            for(int i=1; i<=20; i++){
                System.out.print("-> "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }
}