package dsa;

public class HashTableArray<T> {

    Entry[] arrayHash;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[this.size];
        for (int i = 0; i < arrayHash.length; i++) {
            arrayHash[i] = new Entry<T>();
        }
    }

    int getHash(int key) {
        return key % size; // There are many waysto implement hash
    }

    public void put(int key, T value) {
        int index = getHash(key);
        Entry arrayValue = arrayHash[index];
        Entry newItem = new Entry<T>(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key) {
        T value = null;
        int index = getHash(key);
        Entry arrayValue = arrayHash[index];
        while (arrayValue != null) {
            if (arrayValue.getKey() == key) {
                value = (T) arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.next;
        }
        return value;
    }
}
