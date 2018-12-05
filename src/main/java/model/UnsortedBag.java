package model;

import interfaces.IBag;
import java.util.ArrayList;

public class UnsortedBag<E extends Comparable> implements IBag<E> {
    private ArrayList<E> bag = new ArrayList<>();

    public void add(E item) {
        bag.add(item);
    }

    public E remove() {
        return bag.remove(0);
    }

    public boolean contains(E item) {
        return bag.contains(item);
    }

    public boolean empty() {
        return bag.isEmpty();
    }
}
