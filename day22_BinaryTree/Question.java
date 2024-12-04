package day22_BinaryTree;
// import java.util.*;
public class Question {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // public static boolean uniValued(Node root){
    //     if (root == null) {
    //         return true;
    //     }
    //     if (root.left != null && root.data == root.left.data) {
    //         return false;
    //     }
    //     if (root.right != null && root.data == root.right.data) {
    //         return false;
    //     }
    //     return uniValued(root.left) && uniValued(root.right);
    // }

    Node root;
    void mirror(){
        root = mirror(root);
    }
    Node mirror(Node node){
        if (node == null) {
            return node;
        }
        //do the subtrees
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        //swap the left and right pointer
        node.left = right;
        node.right = left;

        return node;
    }
    void inOrder(){
        inOrder(root);
    }
    void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+ " ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // if (uniValued(root)) {
        //     System.out.print("YES");
        // } else {
        //     System.out.print("No");
        // }
        // System.out.println(uniValued(root));

        // question 2
        Question tree = new Question();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("In order traversal of input tree");
        tree.inOrder();
        System.out.println();
        tree.mirror();
        System.out.println("In order taversaal of binary tree");
        tree.inOrder();
    }
}
