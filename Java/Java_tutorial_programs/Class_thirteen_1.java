import java.util.*;
public class Class_thirteen_1 {
    public static void main(String args[]){

        // ------------------- String Builder -----------------
        
        StringBuilder sb=new StringBuilder("Bangladesh");       //Create an object
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
