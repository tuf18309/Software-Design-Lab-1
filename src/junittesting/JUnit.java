
package junittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JUnit {

    @Test
    public void testDaysTo1() {
        
        Date d1 = new Date(2009, 12, 25);
        Date d2 = new Date(2010, 12, 25);
        
        assertEquals(364, d1.daysTo(d2));
    }
    
    @Test
    public void testDaysTo2() {
        
        Date d3 = new Date(2010, 11, 25);
        Date d4 = new Date(2010, 12, 25);
        
        assertEquals(31, d3.daysTo(d4));
    }
    
    @Test
    public void testDaysTo3() {
        
        Date d5 = new Date(2010, 12, 24);
        Date d6 = new Date(2010, 12, 26);
        
        assertEquals(1, d5.daysTo(d6));
    }
    
    @Test
    public void testDaysTo4() {
        
        Date d7 = new Date(2010, 12, 24);
        Date d8 = new Date(2010, 12, 25);
        
        assertEquals(2, d7.daysTo(d8));
    }
    
    @Test
    public void testDaysTo5() {
        
        Date d9 = new Date(2008, 11, 20);
        Date d10 = new Date(2010, 12, 25);
        
        assertEquals(765, d9.daysTo(d10));
    }
    
    
}
