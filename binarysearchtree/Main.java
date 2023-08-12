package binarysearchtree;

public class Main {
    public static void main(String[] args) {

        /*Binary Search Tree*/
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root : " +bst.root);
        bst.insert(47);
        bst.insert(21);
        bst.rInsert(76);
        bst.insert(18);
//        bst.deleteNode(44);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);
//        System.out.println(bst.rContains(324));
//        System.out.println(bst.rContains(44));
////        System.out.println(bst.minValue(23));
//        System.out.println(bst.root.right.right.value);
        System.out.println(bst.BFS());
        System.out.println(bst.DFSPreorder());
        System.out.println(bst.DFSPostorder());
        System.out.println(bst.DFSInorder());
    }
}
