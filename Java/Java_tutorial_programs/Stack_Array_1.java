class St {

    private int mainArray[];
    private int peek, n;

    St() {
        mainArray = new int[10];
        peek = -1;
        n = 0;
    }

    public void push(int data) {
        if (mainArray.length == n) {
            System.out.println("Array overflow");
            return;
        }
        mainArray[++peek] = data;
        n++;
    }

    public int pop() {
        if (peek == -1) {
            System.out.println("Array underflow");
            return 0;
        } else {
            int previous = mainArray[peek];
            --peek;
            n--;

            return previous;
        }
    }

    public int peek() {
        return peek;
    }

    public void print() {
        if (peek == -1) {
            System.out.println("null");
        } else {
            System.out.println("-> ");
            for (int i = 0; i < peek + 1; i++) {
                System.out.print(mainArray[i] + " ");
            }
        }
    }
}

public class Stack_Array_1 {
    public static void main(String[] args) {
        St ob = new St();
        ob.pop();
        ob.print();

        ob.push(10);
        ob.push(11);
        ob.push(12);
        ob.push(13);
        ob.push(14);
        ob.push(15);
        ob.push(16);
        ob.push(17);
        ob.push(18);
        ob.push(19);
        ob.push(20);

        ob.print();

        System.out.println("Pooped -> " + ob.pop());
        System.out.println("Pooped -> " + ob.pop());
        System.out.println("Pooped -> " + ob.pop());
        System.out.println("Pooped -> " + ob.pop());

        ob.print();

    }
}
