package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
//        hashTable.printTable();
        hashTable.set("bolts",1000);
        hashTable.set("tile",50);
        hashTable.set("lumber",80);
//        hashTable.printTable();
        System.out.println(hashTable.keys());
//        System.out.println(hashTable.get("tile"));
//        System.out.println(hashTable.get("ank"));
//        System.out.println(hashTable.get("lumber"));
    }
}
