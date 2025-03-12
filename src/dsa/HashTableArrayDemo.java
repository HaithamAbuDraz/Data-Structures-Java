package dsa;

public class HashTableArrayDemo {

    public static void main(String[] args) {
        HashTableArray<String> hash = new HashTableArray<String>(10);
        hash.put(1, "Haitham");
        hash.put(12, "Mohammed");
        hash.put(8, "Hasan");
        System.out.println(hash.get(12));
    }
}
