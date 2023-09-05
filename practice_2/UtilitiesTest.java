package practice_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        Utilities util = new Utilities();
        char [] output = util.everyNthChar(new char[] {'p','o','o','r','v','i'} ,2);
        assertArrayEquals(new char[] {'o','r','i'},output);
    }

    @Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF" , util.removePairs("AABBCDEEF"));
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void converter() {
        Utilities util = new Utilities();
        assertEquals(301, util.converter(10,5));
    }

    @Test
    public void nullOfOddLength() {
        Utilities util = new Utilities();
        assertNull(util.nullOfOddLength("odd"));
        assertNotNull(util.nullOfOddLength("even"));
    }
}