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
        String result = Carlosbrc1.romanos(3);
        assertEquals("III", result);
    }

    @Test
    public void testTest2() {
        String result = Carlosbrc1.romanos(58);
        assertEquals("LVIII", result);
    }

    @Test
    public void testTest3() {
        String result = Carlosbrc1.romanos(1994);
        assertEquals("MCMXCIV", result);
    }

}
