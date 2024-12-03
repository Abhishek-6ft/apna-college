package day22_BinaryTree;

public class MinDistanceBtwn2Nodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    // This function help to find out the Lca of tree
    public static Node LowestCommonAncestor(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = LowestCommonAncestor(root.left, n1, n2);
        Node rightLca = LowestCommonAncestor(root.right, n1, n2);
        if (leftLca != null && rightLca != null) {
            return root;
        }
        return leftLca != null ? leftLca : rightLca;
    }

    //This function help to calculate distance between lca 
    public static int lcaDistance(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);

        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        } else if (leftDistance == -1) {
            return rightDistance + 1;
        } else {
            return leftDistance + 1;
        }
    }
    // this function calculate min distance 
    public static int minDistance(Node root, int n1, int n2) {
        Node lca = LowestCommonAncestor(root, n1, n2);
        int distance1 = lcaDistance(lca, n1);
        int distance2 = lcaDistance(lca, n2);

        return distance1 + distance2;

    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 8;
        // System.out.println(LowestCommonAncestor(root, n1, n2).data);
        System.out.println(minDistance(root, n1, n2));
    }
}
