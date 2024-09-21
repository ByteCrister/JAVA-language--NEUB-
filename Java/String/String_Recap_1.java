public class String_Recap_1 {
    public static void main(String[] args) {
        String st1="Hi!", st2=" Im ";

        String st3=st1+st2+"Shakib. Im "+(10+12);
        System.out.println(st3);

        System.out.println("length of the total String : "+st3.length());


        st1="Shakib";
        st2="shakib";
        if(st1.equals(st2)){
            System.out.println("Test-1 completed");
        }else{
            System.out.println("Test-1 passed");
        }


        if(st1.equalsIgnoreCase(st2)){
            System.out.println("Test-2 passed");
        }else{
            System.out.println("Test-2 completed");
        }

        if(st1.compareTo(st2)==0){
            System.out.println("Test-3 passed");
        }else{
            System.out.println("Test-3 completed");
        }

        String st4="Bangladesh";
        System.out.println("Character at index 4 : "+st4.charAt(4));
        

        if(st4.startsWith("Bang")){
            System.out.println("Test-4 passed");
        }else{
            System.out.println("Test-4 completed");
        }

        if(st4.endsWith("des")){
            System.out.println("Test-5 passed");
        }else{
            System.out.println("Test-5 completed");
        }

        System.out.println("Substring of Bangladesh : "+st4.substring(3, 6));
        
    }
}
