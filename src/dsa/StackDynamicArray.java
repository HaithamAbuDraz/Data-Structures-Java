package dsa;

import java.util.Arrays;

public class StackDynamicArray<T> {

    int size;
    Object[] ArrayStack;
    int top;

    public StackDynamicArray(int size) {
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem) {
        ensureCapacity(top + 2);
        top = top + 1;
        ArrayStack[top] = newItem;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = ArrayStack.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {//delete item
                newCapacity = minCapacity;
            }
            ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
        }
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
