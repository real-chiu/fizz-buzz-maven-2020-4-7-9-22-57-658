package com.oocl;

public class FizzBuzz {
    public String checkFizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }


        return Integer.toString(number);
    }
}
