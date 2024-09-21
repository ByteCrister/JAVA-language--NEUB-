import java.util.*;
public class String_2 {
    public static void main(String args[]){

        // ------------------- String Builder -----------------
        String mainString  = "Bangladesh";
        
        StringBuilder sb=new StringBuilder(mainString);       //Create an object
        System.out.println(sb);

        // get a char from index
        System.out.println(sb.charAt(3));

        // set a char
        sb.setCharAt(6,'D');
        System.out.println(sb);

        // insert char
        sb.insert(0,'_');
        System.out.println(sb);

        //delete char 
        sb.delete(0,7);
        System.out.println(sb);

        //append char
        sb.append(" : BD");
        System.out.println(sb);

        // string length
        System.out.println(sb.length());

    }
}
