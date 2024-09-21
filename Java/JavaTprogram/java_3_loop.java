import java.util.Scanner;
public class java_3_loop {
    public static void main(String args[]){
        System.out.print("Enter the number of table :");
        Scanner sc=new Scanner(System.in);
        
        int table=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(table+" * "+i+"  =  "+table*i);
        }

        String name[]={"Sadiqul ","Islam ","Shakib"};

        //data-type var_ : arrayName
        for(String names:name){
            System.out.print(names);
        }

        
    }
}
