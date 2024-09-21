interface StackFlow {
    void push(int a);

    int pop();

    int peek();
}

class StackImplement implements StackFlow {
    private int size, stack[], top = -1;

    StackImplement(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Array overflowing");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            return -1;
        } else {
            return stack[top];
        }
    }

}

public class StackAndQueue {
    public static void main(String[] args) {

        StackImplement s = new StackImplement(10);
        for (int i = 1; i <= 12; i++) {
            System.out.println("Push : " + (i + i));
            s.push(i + i);
        }
        System.out.println("Top : " + s.peek());
        for (int i = 1; i <= 10; i++) {
            int a = s.pop();
            if (a == -1)
                System.out.println("Array underflow");

            System.out.println("Pop : " + a);
        }

    }
}
