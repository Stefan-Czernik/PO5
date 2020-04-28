
package testy;

import org.junit.Test;
import static org.junit.Assert.*;


public class PorownanieTest {
    
    private Porownanie porownanie=new Porownanie(123,76); 
    @Test
    public void test1() {
         assertTrue(porownanie.test_last_digit(123,65));
    }
     @Test
    public void test2() {
         assertTrue(porownanie.test_last_digit(65,55));
    }
     @Test
    public void test3() {
         assertTrue(porownanie.test_last_digit(123,123));
    }
     @Test
    public void test4() {
         assertFalse(porownanie.test_last_digit(123,87));
    }
     @Test
    public void test5() {
         assertFalse(porownanie.test_last_digit(23,54));
    }
    
}
