import java.util.NoSuchElementException;

/**
 * Created by elbanic on 2017. 7. 14..
 */
public class SingleLinkedList<T> {

    private SLinkedNode<T> head, tail;
    private long sz;

    public SingleLinkedList(T t) {
        head = new SLinkedNode<T>(t);
        head.setNext(null);
        tail = head;
        sz = 1;
    }

    public void insertAt(int id, T t){
        SLinkedNode<T> cur = getNode(id);
        SLinkedNode<T> insertItem = new SLinkedNode<T>(t);
        insertItem.setNext(cur.getNext());
        cur.setNext(insertItem);
        sz++;
    }

    public void setAt(int id, T t){
        SLinkedNode<T> cur = getNode(id);
        cur.setItem(t);
    }

    public void add(T t){
        SLinkedNode<T> cur = getNode((int)sz-1);
        SLinkedNode<T> addItem = new SLinkedNode<T>(t);
        addItem.setNext(null);
        cur.setNext(addItem);
        sz++;
    }

    private SLinkedNode<T> getNode(int id){
        SLinkedNode<T> cur = null;
        if (id < sz) {
            cur = head;
            for (int i=1; i<=id; i++) {
                cur = (SLinkedNode)cur.getNext();
            }
        } else {
            throw new NoSuchElementException();
        }
        return cur;
    }

    public T get(int id){
        return getNode(id).getItem();
    }

    public int getID(T t){
        int id = -1;
        SLinkedNode<T> cur = head;
        for (int j=1; j<sz; j++) {
            if (cur.getItem()==t) {
                id = j;
                break;
            }
            cur = (SLinkedNode)cur.getNext();
        }
        if (id==-1) {
            throw new NoSuchElementException();
        }
        return id;
    }

    public void removeAt(int id){

        if (id==0) {
            SLinkedNode<T> cur = (SLinkedNode)head.getNext();
            head = cur;
        }
        else if (id==sz-1) {
            SLinkedNode<T> cur = getNode(id-1);
            cur.setNext(null);
            tail = cur;
        }
        else {
            SLinkedNode<T> cur = getNode(id-1);
            SLinkedNode<T> next = getNode(id+1);
            cur.setNext(next);
        }
        sz--;
    }

    public T head() { return head.getItem(); }
    public T tail() { return tail.getItem(); }

    public long size() {
        return sz;
    }
}
