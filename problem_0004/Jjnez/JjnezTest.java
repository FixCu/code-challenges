package Jjnez;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @autor Jjnez
*/
 
public class JjnezTest {
    
    @Test
    public void testTest1() {
        Integer result = Jjnez.duplicate([1, 2, 3, 4]);
        assertInteger(1);
    }
    
    @Test
    public void testTest2() {
        Integer result = Jjnez.duplicate([6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4]);
        assertInteger(7);
    }
} 
