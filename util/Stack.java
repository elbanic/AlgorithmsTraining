import java.util.EmptyStackException;

/**
 * Created by 1003850 on 2017. 7. 14..
 */
public class Stack<T> {

    private SLinkedNode<T> top;
    private long sz;

    public Stack(T t) {
        SLinkedNode<T> prev = top;
        top = new SLinkedNode<T>(t);
        sz = 1;
    }

    public T pop() {
        if (sz==0) throw new EmptyStackException();

        T ret = top.getItem();
        top = (SLinkedNode)top.getNext();
        sz--;
        return ret;
    }

    public void push(T t) {
        SLinkedNode<T> next = top;
        top = new SLinkedNode<T>(t);
        top.setNext(next);
        sz++;
    }

    public long size() {
        return sz;
    }
}
