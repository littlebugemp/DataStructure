
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void preAppend(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length == 0){
                tail = null;
            }
            return temp;
        }

    }

    public Node get(int index){
        if(index<0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0; i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void getUsingValue(int value){
        Node temp = head;
        int count = 0;
        while (temp!= null){
            if(temp.value == value){
                System.out.println("Element " +temp.value + " found at index "+count);
                break;
            }
        }
        temp = temp.next;
        count++;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = null;
        Node before = null;
        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node deleteNode(int index){
        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if (index == length){
            return removeLast();
        }
        Node temp = get(index);
        Node preNode = get(index-1);
        preNode.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre  = head;
        while (temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public boolean insert(int index, int value){
        if(index == 0){
            preAppend(value);
            return true;
        }
        if(index == length-1){
            append(value);
            return true;
        }
        if(index<0 || index>length){
            return false;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1 );
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void getHead(){
        System.out.println("Head : "+head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }
    public void getLength(){
        System.out.println("Length : "+length);
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("---------------");
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }


}
