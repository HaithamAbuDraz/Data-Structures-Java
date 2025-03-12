package dsa;

public class DSA {

    public static void main(String[] args) {
        //Simple Array
        int[] numbers = new int[5];
        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 14;
        numbers[3] = 1;
        numbers[4] = 18;
        System.out.println("Simple Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        //Object of Array
        Students[] stu = new Students[3];
        stu[0] = new Students("Haitham", 120250001);
        stu[1] = new Students("Mohammed", 120250002);
        stu[2] = new Students("Bilal", 120250003);
        System.out.println("\nArray of Object: ");
        for (Students students : stu) {
            System.out.println("Name: " + students.name + "\tID: " + students.id);
        }
    }

}
