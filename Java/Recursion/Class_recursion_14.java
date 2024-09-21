public class Class_recursion_14 {
    public static String keypad[]={".",  "abc", "def", "ghi", "jkl", "mno", "pqrs","tu","vwx", "yz"};

    public static void printKeypadCombination(String str, String newCombination, int index){

        if(index == str.length()){
            System.out.println(newCombination);
            return;
        }
        char ch = str.charAt(index);
        String combination = keypad[ch - '0'];

        for(int i=0; i<combination.length(); i++){
            printKeypadCombination(str, newCombination + combination.charAt(i), index+1);
        }
    }
    public static void main(String args[]){

        /* print keypad combinations */

        String keys = "23";
        printKeypadCombination(keys, "", 0);
    }
}
