package sort;

class QuickSort {

    static void quickSort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) return;
        int middle = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = array[middle];
        int i = lowIndex;
        int j = highIndex;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (lowIndex < j) {
            quickSort(array, lowIndex, j);
        }
        if (highIndex > i) {
            quickSort(array, i, highIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 11, 25, 10, 7, 16, 3};
        System.out.println("Array before sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nArray after sorting");
        quickSort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
