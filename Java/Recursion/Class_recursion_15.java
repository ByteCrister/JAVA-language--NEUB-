public class Class_recursion_15 {
    public static void permutation(String MyString, String permutation){

        if(MyString.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<MyString.length(); i++){

            char currentChar = MyString.charAt(i);
            String newString = MyString.substring(0, i) + MyString.substring(i+1);

            permutation(newString, permutation+currentChar);
        }
    }
    public static void main(String args[]){

        /* print all permutations of a string */

        //all possible cases of letters
        
        String str = "abc";

        permutation(str, ""); // O(n!)


    }
}
