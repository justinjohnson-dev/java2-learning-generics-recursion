package model;

import interfaces.IBag;
import java.util.ArrayList;
import java.util.List;

public class SortedBag<E extends Comparable> implements IBag<E> {
    private ArrayList<E> bag = new ArrayList<>();

    public void add(E item) {
        int position = recursiveBinarySearch(bag, item);
        if (position >= 0) {
            position += position;
        } else {
            position = (position * -1) -1;
        }
        bag.add(position, item);
    }
    public E remove() {
        return bag.remove(0);
    }
    public boolean contains(E item) {
        return recursiveBinarySearch(bag, item) >= 0;
    }
    public boolean empty() {
        return bag.isEmpty();
    }

    private int recursiveBinarySearch(List<E> list, E key) {
        int low = 0;
        int high = list.size() - 1;

        return recursiveBinarySearch(list, key, low, high);
    }

    private int recursiveBinarySearch(List<E> list, E key, int low, int high) {
        if (low > high) {
            return -low -1;
        }

        int mid = (low + high) / 2;
        if (key.compareTo(list.get(mid)) < 0) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if (key.compareTo(list.get(mid)) == 0) {
            return mid;
        } else {
           return recursiveBinarySearch(list, key, mid + 1, high);
        }
    }
}