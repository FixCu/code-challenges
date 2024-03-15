/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package carlosbrc1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlosbrc
 */
public class Carlosbrc1Test {

    /**
     * Test of test method, of class Carlosbrc1.
     */
    @Test
    public void testTest1() {
        boolean result = Carlosbrc1.isPalindrome(121);
        assertTrue(result);
    }

    @Test
    public void testTest2() {
        boolean result = Carlosbrc1.romanos(58);
        assertTrue(result);
    }

    @Test
    public void testTest3() {
        boolean result = Carlosbrc1.romanos(1994);
        assertFalse(result);
    }

}
