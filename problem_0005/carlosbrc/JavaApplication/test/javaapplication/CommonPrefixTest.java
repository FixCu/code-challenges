/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlosbrc
 */
public class CommonPrefixTest {

    @Test
    public void testCommonPrefix() {
        String[] words = null;
        String expResult = "";
        String result = CommonPrefix.commonPrefix(words);
        assertEquals(expResult, result);
    }

    @Test
    public void testCommonPrefix1() {
        String[] words = {"flower", "flow", "flight"};
        String expResult = "fl";
        String result = CommonPrefix.commonPrefix(words);
        assertEquals(expResult, result);
    }

    @Test
    public void testCommonPrefix2() {
        String[] words = {"flower"};
        String expResult = "flower";
        String result = CommonPrefix.commonPrefix(words);
        assertEquals(expResult, result);
    }

    @Test
    public void testCommonPrefix3() {
        String[] words = {"dog", "racecar", "car"};
        String expResult = "";
        String result = CommonPrefix.commonPrefix(words);
        assertEquals(expResult, result);

    }

}
