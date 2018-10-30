package lesson1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class closestTo10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = in.nextInt();
        System.out.print("Введите число: ");
        double m = in.nextInt();
        if(abs(n-10)>abs(m-10)){
            System.out.println("Число "+ m + " ближе к числу 10 чем "+ n);
        }
        else if(abs(n-10)==abs(m-10)){
            System.out.println("Числа на одинаковом расстоянии от 10 ");
        }
        else{
            System.out.println("Число "+ n + " ближе к числу 10 чем "+ m);
        }
    }
}
