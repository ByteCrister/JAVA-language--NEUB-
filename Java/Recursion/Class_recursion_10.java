public class Class_recursion_10 {
    public static void add_x(String s,int count, String st, int index){

        if(s.length() == index){
            for(int i=0; i<count; i++){
                st+='x';
            }

            System.out.println(st);

            return;
        }

        char ch=s.charAt(index);
        if(ch == 'x'){
            count++;
            add_x(s, count, st, index+1);
        }else{
            st+=ch;
            add_x(s, count, st, index+1);
        }
    }
    public static void main(String args[]){

        /* move all x to end of the String */

        String st="amxnajxnjxokxjiox";
        add_x(st,0,"",0);
    }
}
