public class Thread3 {
    public static void main(String[] args) {

        try{
            for(int i=0; i<"Hello, this is a test program. Im a Sadiqul Islam Shakib".length(); i++){
                System.out.print("Hello, this is a test program. Im a Sadiqul Islam Shakib".charAt(i));
                Thread.sleep(200);
            }

        }catch(InterruptedException e){

        }
    }
}
