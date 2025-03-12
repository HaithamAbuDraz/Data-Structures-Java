package dsa;

public class StackArray<T> {

    int size;
    Object[] ArrayStack;
    int top;

    public StackArray(int size) {
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        top = top + 1;
        ArrayStack[top] = newItem;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Emptey");
            return null;
        }
        T item = (T) ArrayStack[top];
        top = top - 1;
        return item;
    }

    public Boolean isFull() {
        return (top == size - 1);
    }

    public Boolean isEmpty() {
        return (top == -1);
    }

}
