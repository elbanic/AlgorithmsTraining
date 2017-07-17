import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elbanic on 2017. 7. 17..
 */
public class StringPermutationTest {
    @Test
    public void isStringPermutation() throws Exception {

        StringPermutation sp = new StringPermutation("hello22");
        boolean b = sp.isStringPermutation("2h2oell");
        System.out.println(b);

        boolean b2 = sp.isStringPermutation("2h2oella");
        System.out.println(b2);
    }
}