import java.util.Scanner;

public class java_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else {
            System.out.println(c+" is greater than "+a+" and "+b);

        }

        System.out.print("Enter two number's : ");
        int aa=sc.nextInt();
        int bb=sc.nextInt();
 
        System.out.println("<<Enter your choice >> \n1)sum\n2)sub\n3)product\n4)division\n5)Modulos");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            System.out.println(aa+" + "+bb+" = "+(aa+bb));
            break;
            
            case 2:
            System.out.println(aa+" - "+bb+" = "+(aa-bb));
            break;
            
            case 3:
            System.out.println(aa+" * "+bb+" = "+(aa*bb));
            break;
            
            case 4:
            System.out.println(aa+" / "+bb+" = "+(aa/bb));
            break;
            
            case 5:
            System.out.println(aa+" % "+bb+" = "+(aa%bb));
            break;

            default:
            System.out.println("You have entered wrong choice !!");

        }
    }
}
