import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elbanic on 2017. 7. 20..
 */
public class SingleLinkedListTest {
    @Test
    public void insertAt() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        testSLL.insertAt(1,1000);
        System.out.println(testSLL.get(1));
    }

    @Test
    public void setAt() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        testSLL.setAt(1,100);
        System.out.println(testSLL.get(1));
    }

    @Test
    public void add() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        System.out.println(testSLL.getID(5));
    }

    @Test
    public void get() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        System.out.println(testSLL.get(2));
    }

    @Test
    public void getID() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        System.out.println(testSLL.getID(5));
    }

    @Test
    public void head() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        System.out.println(testSLL.head());
    }

    @Test
    public void tail() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        System.out.println(testSLL.tail());
    }

    @Test
    public void size() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        System.out.println(testSLL.size());
    }

    @Test
    public void removeAt() throws Exception {
        SingleLinkedList<Integer> testSLL = new SingleLinkedList<Integer>(1);
        testSLL.add(5);
        testSLL.add(50);
        testSLL.removeAt(2);
        System.out.println(testSLL.get(1));
        testSLL.add(500);
        testSLL.removeAt(1);
        System.out.println(testSLL.get(1));
        testSLL.add(150);
        testSLL.removeAt(0);
        System.out.println(testSLL.get(0));
    }
}