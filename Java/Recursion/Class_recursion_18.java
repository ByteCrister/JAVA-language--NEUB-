public class Class_recursion_18 {
    public static int TotalNumberOtwayToCallGuests(int n){

        if( n<= 1){
            return 1;
        }

        int single = TotalNumberOtwayToCallGuests(n-1);
        int pairs = (n-1) * TotalNumberOtwayToCallGuests(n-2);

        return single + pairs;

    }
    public static void main(String args[]) {

        /*
         * find the number of ways in which you can
         * invite n people to your party, single or in pairs
         */

        System.out.println(TotalNumberOtwayToCallGuests(3));

    }
}
