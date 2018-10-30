package lesson2;

import java.util.Scanner;

public class fibonachi {
    public static void main(String args[]) {
        System.out.print(calculatefibonachi(56));
    }

    private static int calculatefibonachi(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            n = calculatefibonachi(n-1) + calculatefibonachi(n-2);
            return n;
        }
    }
}
