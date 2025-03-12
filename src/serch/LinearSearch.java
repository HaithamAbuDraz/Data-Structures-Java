package serch;

public class LinearSearch {

    public static void main(String[] args) {
        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int searchNumber = 9999;
        int numberTrys = 0;
        for (int i = 0; i < numbers.length; i++) {
            numberTrys++;
            if (numbers[i] == searchNumber) {
                System.out.println("The number was found after " + numberTrys + " times");
                break;
            }
        }
    }
}
