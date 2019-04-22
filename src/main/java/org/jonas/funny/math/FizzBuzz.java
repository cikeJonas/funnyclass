package org.jonas.funny.math;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public void stage1(int num) {
        if (num < 1) {
            return;
        }
        for (int i = 1; i <= num; i++) {
            stage1Play(i);
        }
    }

    private boolean stage1Play(int num) {
        boolean mod3;
        boolean mod5;
        if (mod3 = isModZero(num, 3)) {
            print(FIZZ);
        }
        if (mod5 = isModZero(num, 5)) {
            print(BUZZ);
        }
        if (!(mod3 || mod5)) {
            print(num + "");
        }
        println();
        return mod3 || mod5;
    }

    private boolean isModZero(int num, int div) {
        return num % div == 0;
    }

    public void stage2(int num) {
        if (num < 1) {
            return;
        }
        boolean handle3;
        boolean handle5;
        for (int i = 1; i <= num; i++) {
            if (handle3 = (isModZero(i, 3) || isInclude(i, 3))) {
                print(FIZZ);
            }
            if (handle5 = (isModZero(i, 5) || isInclude(i, 5))) {
                print(BUZZ);
            }
            if (!(handle3 || handle5)) {
                print(i + "");
            }
            println();
        }

    }

    private boolean isInclude(int num, int b) {
        while (num > 0) {
            int a = num % 10;
            if (a == b) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }

    private void print(String str) {
        System.out.print(str);
    }

    private void println() {
        System.out.println();
    }
}
