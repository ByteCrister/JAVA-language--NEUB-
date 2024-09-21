public class test_java {
    public static void main(String args[]){
        int n=904,a=0,l=0;
       while(l!=2){
        a=n%10;
        n=n/10;
        l++;
       }
       System.out.println(a);
    }
}
