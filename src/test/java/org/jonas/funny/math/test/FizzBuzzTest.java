package org.jonas.funny.math.test;

import org.jonas.funny.math.FizzBuzz;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void stage1Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.stage1(100);
    }

    @Test
    public void stage2Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.stage2(100);
    }


}
