package me.alidg;

/**
 * @author Ali Dehghani
 */
class Numbers {
    static long absolute(long num) {
        if (num == Long.MIN_VALUE)
            throw new IllegalArgumentException("Can't calculate the absolute value: " + num);

        return Math.abs(num);
    }
}
