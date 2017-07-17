import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Created by elbanic on 2017. 7. 14..
 */
public class HashMap<K, V> extends Map{

    private ArrayList<hPair> hash;
    private K key;

    protected class hPair<Integer, K> {
        protected int key;
        protected K rkey;
        public hPair(int key, K rkey){
            this.key = key;
            this.rkey = rkey;
        }
    }

    public HashMap() {
        super();
        hash = new ArrayList<hPair>();
    }

    public HashMap(K key, V value) {
        super(key, value);
        hash = new ArrayList<hPair>();
        hash.add(new hPair(key.hashCode(), key));
    }

    @Override
    protected int getID(Object key) {
        int hskey = key.hashCode();
        for (int i=0; i<hash.size(); i++){
            if (hskey==hash.get(i).key) return i;
        }
        return -1;
    }

    @Override
    public void put(Object key, Object value) {
        super.put((K)key, (V)value);
        int hskey = key.hashCode();
        int id = getID(key);
        if (id==-1) { hash.add(new hPair(hskey, (K)key)); }
    }

    @Override
    public void remove(Object key) {
        super.remove((K)key);
        if (hash.size()<=0) throw new EmptyStackException();
        int id = getID(key);
        hash.remove(id);
    }
}