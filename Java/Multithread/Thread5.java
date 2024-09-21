class Thread5{
    public static void main(String[] args) {

        String str = "\n\nSystem running ";
        try {
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i));
                Thread.sleep(100);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    
        try{
            for(int i=1; i<=5; i++){
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}