package day23_BinarySearchTree;

public class ValidateBst {
    static class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
        }
    }
    //insert function for Bst
    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder funtion
    public static void inOrderRoot(Node root){
        if (root == null) {
            return;
        }
        inOrderRoot(root.left);
        System.out.print(root.data+" ");
        inOrderRoot(root.right);
    }

    // this function find the binary search tree is valid or not
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    //
    public static void main(String[] args) {
        int value[] = {8, 5, 3, 6, 10, 11};
        Node root = null;

        for(int i = 0; i<value.length;i++){
            root = insert(root, value[i]);
        }
        inOrderRoot(root);
        System.out.println();
        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else{
            System.out.println("Not valid");
        }
    }
}
