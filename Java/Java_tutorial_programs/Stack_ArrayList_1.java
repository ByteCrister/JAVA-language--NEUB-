import java.util.*;

public class Stack_ArrayList_1 {
    class ST {
        private int peek;

        ST() {
            peek = -1;
        }

        static ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(++peek, data);
        }

        public int pop() {
            if (list.size() == 0) {
                System.out.println("List is empty");
                return 0;
            } else {
                int previous = list.remove(peek--);
                return previous;
            }
        }

        public int peek() {
            return list.get(peek);
        }

        public void print() {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Stack_ArrayList_1 n =new Stack_ArrayList_1();
        Stack_ArrayList_1.ST ob=n.new ST();

        ob.push(10);
        ob.push(11);
        ob.push(13);

        ob.print();

        System.out.println(ob.peek());

        
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
    }
}
