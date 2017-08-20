package me.alidg;

import org.junit.Test;

/**
 * @author Ali Dehghani
 */
public class NumbersIT {

    @Test(expected = IllegalArgumentException.class)
    public void testLargeNumber() {
        Numbers.absolute(Long.MIN_VALUE);
    }
}
