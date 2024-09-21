import java.util.*;
public class Stack_Collection_FramrWork_1 {
    public static void pushAtbottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int value=s.pop();

        pushAtbottom(data, s);
        s.push(value);

    }

    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int value=stack.pop();
        reverse(stack);
        pushAtbottom(value, stack);
    }
    public static void main(String[] args) {
        Stack<Integer>list=new Stack<>();

        // System.out.println(list.pop());
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        pushAtbottom(100,list);

        System.out.println(list);

        reverse(list);

        System.out.println(list);


    }
}
