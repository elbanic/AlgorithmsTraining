import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Created by elbanic on 2017. 7. 14..
 */
public class Map<K, V> {

    protected ArrayList<Pair> items;
    protected int sz;

    protected class Pair<K, V> {
        protected K key;
        protected V value;
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public Map() {
        items = new ArrayList<Pair>();
        sz = 0;
    }

    public Map(K key, V value) {
        items = new ArrayList<Pair>();
        items.add(new Pair(key, value));
        sz = 1;
    }

    protected int getID(K key) {
        for (int i=0; i<sz; i++){
            if (key==items.get(i).key) return i;
        }
        return -1;
    }

    public V get(K key) {
        int id = getID(key);
        if (id==-1)
            throw new NoSuchElementException();
        return (V)items.get(id).value;
    }

    public void put(K key, V value) {
        int id = getID(key);
        if (id==-1) { items.add(new Pair(key, value)); sz++; }
        else { items.get(id).value = value; }
    }

    public void remove(K key) {
        if (sz<=0) throw new EmptyStackException();
        int id = getID(key);
        items.remove(id);
        sz--;
    }

    public int size() {
        return sz;
    }

    public ArrayList<K> getKeys(){
        ArrayList<K> keys = new ArrayList<K>();
        for (int i=0; i<sz; i++) {
            keys.add((K)items.get(i).key);
        }
        return keys;
    }
}
