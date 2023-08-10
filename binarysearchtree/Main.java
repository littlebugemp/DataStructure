package binarysearchtree;

public class Main {
    public static void main(String[] args) {

        /*Binary Search Tree*/
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root : " +bst.root);
        bst.insert(23);
        bst.insert(13);
        bst.rInsert(44);
        bst.insert(223);
        bst.insert(32);
        bst.insert(245);
        System.out.println(bst.rContains(324));
        System.out.println(bst.rContains(44));
        System.out.println(bst.root.right.right.value);
    }
}
