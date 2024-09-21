class Node {
    int data;
    Node next;
}

class LL {
    private int n;
    private Node head, tail;

    LL() {
        n = 0;
        head = tail = null;
    }

    public Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public void push(int value) {
        Node currentNode = newNode(value);
        currentNode.next = head;
        head = currentNode;

        if (n == 0) {
            tail = currentNode;
        }
        n++;
    }

    public int pop() {
        if (n == 0) {
            System.out.println("List is empty");
            return 0;
        }

        int previous = head.data;
        head = head.next;
        n--;
        if (n == 0) {
            tail = null;
        }
        return previous;
    }

    public void enqueue(int data) {
        Node u = newNode(data);
        if (n == 0) {
            head = u;
        } else {
            tail.next = u;
        }
        tail = u;
        n++;
    }

    public int dequeue(){
        return pop();
    }

    public void print(){
        Node index=head;
        System.out.print("[ ");
        while(index!=null){
            System.out.print(index.data+" ");
            index=index.next;
        }
        System.out.print(" ]");
    }
}

public class SL_List {
    public static void main(String[] args) {
        LL list=new LL();

        list.push(10);
        list.push(11);
        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);

        list.print();
        
        list.pop();
        list.pop();
        list.print();
    }

}
