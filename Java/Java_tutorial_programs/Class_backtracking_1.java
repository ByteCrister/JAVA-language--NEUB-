public class Class_backtracking_1{
    public static void permutation(String mainStr, String newStr) {

        if (mainStr.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < mainStr.length(); i++) {
            char ch = mainStr.charAt(i);
            String newString = mainStr.substring(0, i) + mainStr.substring(i + 1);
            permutation(newString, newStr + ch);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        permutation(str, "");
    }
}
