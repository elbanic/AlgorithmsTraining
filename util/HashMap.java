import java.util.ArrayList;

/**
 * Created by 1003850 on 2017. 7. 14..
 */
public class HashMap {

    private ArrayList<Pair> items;
    private ArrayList<Pair> hash;
    private int sz;

    private class Pair<K, V> {
        private K key;
        private V value;
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
    }



}
