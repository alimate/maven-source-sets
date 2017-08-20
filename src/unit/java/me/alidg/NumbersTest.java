package me.alidg;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Ali Dehghani
 */
public class NumbersTest {

    @Test
    public void areAlwaysPositive() {
        assertTrue(Numbers.absolute(-12) > 0);
    }
}
