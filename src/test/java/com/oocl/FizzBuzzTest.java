package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number_if_not_multiple_of_three_or_five () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(1);
        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_if_multiple_of_three () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(3);
        String resultTwo = fizzBuzz.checkFizzBuzz(6);
        Assert.assertEquals("Fizz", result);
        Assert.assertEquals("Fizz", resultTwo);
    }

}
