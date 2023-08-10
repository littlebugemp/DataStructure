package doublylinkedlist;

public class DoublyLinkedList {

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("---------------");
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+length);
    }

    public void append(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;

    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else {
//        Node temp = tail.prev;
//        temp.next = null;
//        tail.prev = null;
//        tail = temp;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public Node get(int index){
        if(index <0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            length++;
            return true;
        }
        if(index == length){
            append(value);
            length++;
            return true;
        }
        Node newNode = new Node(value);
        Node before  = get(index-1);
        Node after   = before.next;

        before.next = newNode;
        newNode.prev= before;
        newNode.next= after;
        after.prev  = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        Node node = get(index);
        if(index < 0 || index>length){
            return null;
        }
        if(index == length){
            removeLast();
            length--;
            return node;
        }
        if (index == 0){
            length--;
            return node;
        }
        if(node!=null){
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node.next = null;
            node.prev = null;
            length--;
            return node;
        }
        return null;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
//            temp = head.next;
//            head.next = null;
//            temp.prev = null;
//            head = temp;
        }
        length--;
       return temp;
    }

}
