/**
 * Created by 1003850 on 2017. 7. 14..
 */
class Node<T> {
    private T item;
    public Node(T t) {
        item = t;
    }
    T getItem() {
        return item;
    }
}

class SLinkedNode<T> extends Node<T>{
    private Node<T> next;

    public SLinkedNode(T t) {
        super(t);
    }
    void setNext(Node<T> t) {
        next = t;
    }
    Node<T> getNext() {
        return next;
    }
}

class DLinkedNode<T> extends Node<T>{
    private Node<T> prev;
    private Node<T> next;

    public DLinkedNode(T t) {
        super(t);
    }
    void setNext(Node<T> t) {
        next = t;
    }
    void setPrev(Node<T> t) {
        prev = t;
    }
    Node<T> getNext() {
        return next;
    }
    Node<T> getPrev() {
        return prev;
    }
}
