
package testy;

import org.junit.Test;
import static org.junit.Assert.*;

public class SekwencjaTest {
    
    private int [] sekwe = new int[] {4,3,2,5,1,2,3};
    private int[] test1=new int[]{5,4,3,2,1};
    private int[] test2=new int[]{7,7,7,7,5,4};
    private int[] test3=new int[]{3};
    private int[] test4=new int[]{1,2,3,2,2,1};
    private Sekwencja sekwencja= new Sekwencja(sekwe);
     
    @Test
    public void test1() {
         assertTrue(sekwencja.sprawdzam(sekwe));
    }
     @Test
    public void test2() {
         assertTrue(sekwencja.sprawdzam(test1));
    }
     @Test
    public void test3() {
         assertTrue(sekwencja.sprawdzam(test2));
    }
     @Test
    public void test4() {
         assertFalse(sekwencja.sprawdzam(test3));
    }
     @Test
    public void test5() {
         assertFalse(sekwencja.sprawdzam(test4));
    }
   
}
