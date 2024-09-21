import java.util.*;
public class String_1 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //String concatenation
        System.out.print("First name : ");
        String Fname=sc.nextLine();
        
        System.out.print("Last name : ");
        String Lname=sc.nextLine();
        
        System.out.println("Your name : "+(Fname+" "+Lname));
        System.out.println("Length : "+((Fname+" "+Lname).length()));  //string length

        //charAt
        String name=(Fname+" "+Lname);
        for(int i=0; i<(name.length()); i++){
            System.out.println(name.charAt(i));
        }

        //compare

        // n1>n2 : +ve value
        // n1==n2 : 0
        // n1<n2 : -ve value

        String n1="shakib",n2="shakib_";

        if(n1.compareTo(n2)==0){
            System.out.println("String's are equal");
        }else{
            System.out.println("String's are not equal");
        }

        //substring
        //string_Name.substring( begging_index, ending_index);

        String country="B_a_n_g_l_a_d_e_s_h";
        String Cname=country.substring(11,13);
        System.out.println(Cname);
        System.out.println((country.substring(11,country.length()))); 
       
       
    }
}
