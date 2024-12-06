package day23_BinarySearchTree;
import java.util.*;
public class BSTtoBalanceBST {
    
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void getInOrder(Node root, ArrayList<Integer> inorder){
        if (root == null) {
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }
    public static Node createBst(ArrayList<Integer> inorder, int strt, int end){
        if (strt>end) {
            return null;
        }
        int mid = (strt + end) /2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, strt, mid-1);
        root.right = createBst(inorder, mid+1, end);
        return root;
    }
    public static Node balanceBst(Node root){
        // inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);

        // sorted inorder -> balanced Bst
        root = createBst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = balanceBst(root);
        preOrder(root);
    }
}
