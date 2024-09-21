public class Class_recursion_12 {

    public static void Subsequences(String str, String newString, int index){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(index);

        //add to the string 
        Subsequences(str, newString +  ch , index+1);
        
        // or not
        Subsequences(str, newString , index+1); 
    }

    public static void main(String args[]){

        /* print all the subsequences of a string */
        
        String str="abc";

        Subsequences(str, "", 0);
    }
}
