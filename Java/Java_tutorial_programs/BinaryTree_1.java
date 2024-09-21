import java.util.*;

public class BinaryTree_1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        static Node BuildTree(int TreeNodes[]) {
            index++;
            if (index >= TreeNodes.length || TreeNodes[index] == -1) {
                return null;
            }
            Node NewNode = new Node(TreeNodes[index]);
            NewNode.left = BuildTree(TreeNodes);
            NewNode.right = BuildTree(TreeNodes);

            return NewNode;

        }
    }

    static void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printPreorder(node.left);
        System.out.println(node.data + " ");
        printPreorder(node.right);
    }

    static void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.println(node.data + " ");
    }

    static void levelOrder(Node root) {

        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println("");
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

    static int CountOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return CountOfNodes(root.left) + CountOfNodes(root.right) + 1;
    }

    static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return SumOfNodes(root.left) + SumOfNodes(root.right) + root.data;
    }

    static int HeightOftree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSubtree = HeightOftree(root.left);
        int rightSubtree = HeightOftree(root.right);

        int height = Math.max(leftSubtree, rightSubtree) + 1;

        return height;
    }

    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int left_rightHeight = HeightOftree(root.left) + HeightOftree(root.right) + 1;

        return Math.max(left_rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    static class Info_diameter {
        int height;
        int diameter;

        Info_diameter(int h, int d) {
            this.height = h;
            this.diameter = d;
        }
    }

    static Info_diameter diameter2(Node root) {

        if (root == null) {
            return new Info_diameter(0, 0);
        }
        Info_diameter left = diameter2(root.left);
        Info_diameter right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int leftDiameter = left.diameter;
        int rightDiameter = right.diameter;

        int left_rightHeight = left.height + right.height + 1;

        int myDiameter = Math.max(left_rightHeight, Math.max(leftDiameter, rightDiameter));

        Info_diameter Info = new Info_diameter(myHeight, myDiameter);
        return Info;
    }

    static boolean isIdentical(Node Root, Node subRoot) {
        if (Root == null && subRoot == null) {
            return true;
        }

        if (Root == null || subRoot == null) {
            return false;
        }

        if (Root.data == subRoot.data) {
            return isIdentical(Root.left, subRoot.left) && isIdentical(Root.right, subRoot.right);
        }
        return false;
    }

    static boolean subTree(Node Root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (Root == null) {
            return false;
        }

        if (isIdentical(Root, subRoot)) {
            return true;
        }

        return subTree(Root.left, subRoot) || subTree(Root.right, subRoot);
    }

    public static void main(String[] args) {
        int TreeNodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        int subTree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        BinaryTree st = new BinaryTree();

        Node root = tree.BuildTree(TreeNodes);
        Node SubRoot = st.BuildTree(subTree);

        printPreorder(root);

        System.out.println();

        levelOrder(root);
        System.out.println("Total Nodes : " + CountOfNodes(root));
        System.out.println("Sum of Nodes : " + SumOfNodes(root));
        System.out.println("Height of the tree : " + HeightOftree(root));

        System.out.println("Diameter of the tree : " + diameter(root));
        System.out.println("Diameter of the tree using second approch: " + diameter2(root).diameter);

        System.out.println("SubTree or Not  : " + subTree(root, SubRoot));
    }
}
