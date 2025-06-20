package DSA.Binary_SearchTree.ImplmentBST;

public class BinarySearchTree {
    Node root;    /// can be default or any access modifier

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value){
        Node node = new Node(value);

        if (root == null){
            root = node;
            return true;
        }

        Node temp = root;

        while (true){
            if (node.value == temp.value) return false;

            if (node.value < temp.value){
                if (temp.left == null){
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            }

            else {
                if (temp.right == null){
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }

    }


}


class Main{
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(54);
        binarySearchTree.insert(23);
        binarySearchTree.insert(76);
        binarySearchTree.insert(88);
        binarySearchTree.insert(90);


        System.out.println(binarySearchTree.root.value);
        System.out.println(binarySearchTree.root.left.value);
        System.out.println(binarySearchTree.root.right.right.value);
        System.out.println(binarySearchTree.root.right.right.right.value);


    }
}
