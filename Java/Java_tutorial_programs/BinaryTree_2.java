import java.util.*;
import java.util.LinkedList;

public class BinaryTree_2 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static class BinaryTree {

        static int index = -1;

        public static Node BuildTree(int treeArray[]) {
            index++;
            if (index>=treeArray.length|| treeArray[index] == -1) {
                return null;
            }

            Node node = new Node(treeArray[index]);
            node.left = BuildTree(treeArray);
            node.right = BuildTree(treeArray);

            return node;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void leverOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            if (currentNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int left = treeHeight(root.left);
        int right = treeHeight(root.right);

        return Math.max(left, right) + 1;
    }

    public static int CountOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left = CountOfNodes(root.left);
        int right = CountOfNodes(root.right);

        return left + right + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public static int diameter_(Node root) {
        if (root == null) {
            return 0;
        }

        int diameter1 = treeHeight(root.left) + treeHeight(root.right) + 1;
        int diameter2 = diameter_(root.left);
        int diameter3 = diameter_(root.right);

        return Math.max(diameter1, Math.max(diameter2, diameter3));
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }

        if(root==null || subRoot==null){
            return false;
        }

        if(root.data==subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public static boolean subTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if(isIdentical(root, subRoot)){
            return true;
        }

        return subTree(root.left, subRoot)  || subTree(root.right, subRoot);

    }

    public static void main(String[] args) {
        int TreeList[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        int subtree[]={1,2,4,-1,-1,5,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(TreeList);
        Node subRoot=tree.BuildTree(subtree);

        preOrder(root);
        System.out.println("\n\n");
        leverOrder(root);

        System.out.println("Height of the tree : " + treeHeight(root));
        System.out.println("Number of nodes : " + CountOfNodes(root));
        System.out.println("Sum of nodes : " + sumOfNodes(root));
        System.out.println("Diameter of the tree : "+diameter_(root));
        
        System.out.println("Sub root or not : "+ subTree(root,subRoot));

    }
}