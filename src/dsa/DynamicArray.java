package dsa;

import java.util.Arrays;

public class DynamicArray<T> {

    Object[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }

    public int getSize() {
        return data.length;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public void put(int element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {//delete item
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }

    }
}
