package DSA.Binary_SearchTree;

public class BinarySearchTree {

    private Node root;

    class Node{
        private int value;
        private Node left;
        private Node right;

        Node(int value){
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }
}


class Main{
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println("Root is " + binarySearchTree.getRoot());
    }
}