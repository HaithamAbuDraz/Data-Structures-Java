package dsa;

public class StackArrayDemo {

    public static void main(String[] args) {
        //Stack Array
        System.out.println("Stack Array");
        StackArray<Integer> stack = new StackArray<Integer>(5);
        stack.push(1);
        stack.push(25);
        stack.push(13);
        System.out.println("Top: " + stack.top);
        System.out.println(stack.pop());
        System.out.println("Top: " + stack.top);

        //Dynamic Stack Array
        System.out.println("Dynamic Array Stack");
        StackDynamicArray<Integer> stackD = new StackDynamicArray<Integer>(3);
        stackD.push(1);
        stackD.push(25);
        stackD.push(13);
        System.out.println("Top: " + stackD.top);
        System.out.println("Size: " + stackD.ArrayStack.length);
        stackD.push(23);
        System.out.println("Size: " + stackD.ArrayStack.length);
        System.out.println(stackD.pop());
        System.out.println("Top: " + stackD.top);
    }
}
