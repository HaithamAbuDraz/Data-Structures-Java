package sort;

public class MergeSort {

    int[] array;
    int[] tempArray;

    public static void main(String[] args) {
        int[] array = {1, 11, 25, 10, 7, 16, 3};
        System.out.println("Array before sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        new MergeSort().prepareForSort(array);
        System.out.println("\nArray after sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    void prepareForSort(int[] array) {
        //Prepare For Sort
        this.array = array;
        this.tempArray = new int[array.length];
        doMergeSort(0, array.length - 1);
    }

    //Devide to small problem
    void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergePart(lowerIndex, middle, higherIndex);
        }
    }

    //Merge small problems and sort
    void mergePart(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
