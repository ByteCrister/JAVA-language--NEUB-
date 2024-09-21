import java.util.Scanner;
public class ClassThree {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your Mark in integer : ");

    int value=sc.nextInt();

    if(value>=80 && value<=100){
        System.out.println("A+");
    }
    else if(value>=70){
        System.out.println("A");        
    }
    else if(value>=60){
        System.out.println("A-");
    }
    else if(value>=50){
        System.out.println("B");
    }
    else if(value>=40){
        System.out.println("C");
    }
    else if(value<40){
        System.out.println("Fail!!");
    }
    
    else {
        System.out.println("Invalid input");
    }


    }
}
