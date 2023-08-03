package heap;

//descendent node will have grater value then ascendent
//complete tree
//can have duplicate i.e. not in BST
//maxheap -- max value on top
//minheap --
//implimenting with arraylist
// leftchild = 2 * parentIndex
// rightchild= 2 * parentIndex + 1
//finding the parent ---- childindex/2
//only one member is removed doesnt matter max heap or min heap


public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        System.out.println(heap.getHeap());
        heap.insert(100);
        System.out.println(heap.getHeap());
        heap.insert(71);
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());
    }
}
