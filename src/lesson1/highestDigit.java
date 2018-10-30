package lesson1;

import java.util.Scanner;

public class highestDigit {
    public static void main(String arvg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int a = in.nextInt();
        int x = a/100;
        int y = a/10%10;
        int z = a%10;
        if(x>y && x>z){
            System.out.print(x);
        }
        else if(y>x && y>z){
            System.out.print(y);
        }
        else System.out.println(z);
    }
}
