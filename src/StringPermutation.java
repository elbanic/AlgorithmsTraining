import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by elbanic on 2017. 7. 14..
 */
public class StringPermutation {

    String str;
    HashMap m;

    public StringPermutation(String str) {
        this.str = str;
        m = new HashMap<Character, Integer>();
        for (int i=0; i<str.length(); i++) {
            try{
                int cnt = (int)m.get(str.charAt(i));
                m.put(str.charAt(i), cnt+1);
            }catch(NoSuchElementException e){
                m.put(str.charAt(i), 1);
            }
        }
    }

    public boolean isStringPermutation(String target) {

        HashMap target_m = m;
        for (int i=0; i<target.length(); i++) {
            try{
                int cnt = (int)target_m.get(target.charAt(i));
                target_m.put(target.charAt(i), cnt-1);
            }catch(NoSuchElementException e){
                return false;
            }
        }

        ArrayList<Character> keys = target_m.getKeys();
        for (int i=0; i<keys.size(); i++) {
            if((int)target_m.get((char)keys.get(i))!=0) return false;
        }
        return true;
    }


}
