package interfaces;

public interface IBag<E> {
    void add(E item);
    E remove();
    boolean contains(E item);
    boolean empty();
}
