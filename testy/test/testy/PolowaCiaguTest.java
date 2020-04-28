
package testy;

import org.junit.Test;
import static org.junit.Assert.*;

public class PolowaCiaguTest {
    private String str="Javajestsuper";
    private String str2="StefanLubiDuzoJesc";
    private PolowaCiagu pol=new PolowaCiagu(str);
    private String test1="Javajes";
    private String test2="StefanLubi";
    
    @Test
    public void test1() {
        assertEquals(test1,pol.polowicznie(str));
    }
    
    @Test
    public void test2() {
        assertEquals(test2,pol.polowicznie(str2));
    }
    @Test
    public void test3() {
        assertEquals(test2,pol.polowicznie(str));
    }
    @Test
    public void test4() {
        assertEquals(test1,pol.polowicznie(str2));
    }
    @Test
    public void test5() {
        assertEquals("Java",pol.polowicznie(str));
    }
    @Test
    public void test6() {
        assertEquals("Stefan",pol.polowicznie(str2));
    }
    
}
