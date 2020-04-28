
package testy;

import org.junit.Test;
import static org.junit.Assert.*;

public class OdwrotnaTablicaTest {
    
    private int [] tab = new int[] {1,2,3,4,5,6};
    private int[] test1=new int[] {6,5,4,3,2};
    private int[] test2=new int[]{7,7,7,7,5,4};

    OdwrotnaTablica odwrotna= new OdwrotnaTablica(tab);
    
     
    @Test
    public void test1() {
         assertEquals("654321",odwrotna.odwroc(tab));
    }
    
     @Test
    public void test2() {
         assertEquals(test2,odwrotna.odwroc(tab));
    }
     @Test
    public void test3() {
         assertEquals("23456",odwrotna.odwroc(test1));
    }
   @Test
    public void test4() {
         assertEquals("65432",odwrotna.odwroc(test1));
    }
    
}
