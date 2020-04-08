package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number_if_not_multiple_of_three_or_five () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(1);
        Assert.assertEquals(result, "1");
    }

}
