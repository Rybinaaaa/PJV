package cz.cvut.fel.pjv;

import javax.swing.table.TableRowSorter;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {
    private int size;
    private String[] arr;
    private int point = 0;

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this(5);
        this.arr = new String[size];
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     *
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.size = capacity;
        this.arr = new String[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (arr[0] == null) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (arr[size - 1] == null) return false;
        return true;
    }

    @Override
    public boolean enqueue(String obj) {
        int actual_point = point % size;
        arr[actual_point] = obj;
        point++;
        return true;
    }

    private void shift() {
        for(int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
    }
    @Override
    public String dequeue() {
        if (isEmpty()) return null;
        String result = arr[0];
        shift();
        point--;
        return result;
    }

    @Override
    public void printAllElements() {
        for (String element : arr) {
            if (element == null) continue;
            System.out.println(element);
        }
    }
}
