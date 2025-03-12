package serch;

public class InterpolationSearch {

    public static void main(String[] args) {
        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int searchNumber = 998999;
        int low = 0;
        int high = numbers.length - 1;
        int mid = 0;
        int numberTrys = 0;
        Boolean isFound = false;
        while (!isFound) {
            if (low > high) {
                System.out.println("The number is not Found");
                break;
            }
            mid = low + ((high - low) / (numbers[high] - numbers[low]))
                    * (searchNumber - numbers[low]) ;
            numberTrys++;
            if (numbers[mid] == searchNumber) {
                System.out.println("The number was found after " + numberTrys + " times");
                break;
            }
            if (numbers[mid] < searchNumber) {
                low = mid + 1;
            }
            if (numbers[mid] > searchNumber) {
                high = mid - 1;
            }
        }
    }
}
