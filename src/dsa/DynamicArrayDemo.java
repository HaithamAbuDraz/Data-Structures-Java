package dsa;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray<Integer> dArray = new DynamicArray<Integer>();
        dArray.put(4);
        System.out.println("Size: " + dArray.getSize());
        dArray.put(2);
        System.out.println("Size: "+ dArray.getSize());
        dArray.put(5);
        System.out.println("Size: "+ dArray.getSize());
        dArray.put(9);
        System.out.println("Size: "+ dArray.getSize());
        dArray.put(8);
        System.out.println("Size: "+ dArray.getSize());
    }
}