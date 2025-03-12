package sort;

public class HeapSort {

    static int total;

    static void Heapify(int[] array, int parentIndex) {
        int leftNodeIndex = parentIndex * 2;
        int rightNodeInedx = parentIndex * 2 + 1;
        int newIndex = parentIndex;

        if (leftNodeIndex < total
                && array[leftNodeIndex] > array[parentIndex]) {
            newIndex = leftNodeIndex;
        }
        if (rightNodeInedx < total
                && array[leftNodeIndex] < array[parentIndex]) {
            newIndex = rightNodeInedx;
        }
        if (newIndex != parentIndex) {
            swap(array, parentIndex, newIndex);
            Heapify(array, newIndex);
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
    static void preSort(int[] array) {
        total = array.length - 1;
        for (int i = total / 2; i > +0; i--) {
            Heapify(array, i);
        }
        for (int i = total; i >= 0; i--) {
            swap(array, 0, i);
            total--;
            Heapify(array, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 11, 25, 10, 7, 16, 3};
        System.out.println("Array before sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nArray after sorting");
        preSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

    
}
