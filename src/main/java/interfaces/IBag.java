package interfaces;

public interface IBag {
    public void add(E item);
    public E remove();
    public boolean contains(E item);
    public boolean empty();
}
