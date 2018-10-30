package lesson1;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class quadratic {
    public static void main(String args[]){
        double a,b,c,x,x2,d;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную a: ");
        a = in.nextInt();
        System.out.print("Введите переменную b: ");
        b = in.nextInt();
        System.out.print("Введите переменную c: ");
        c = in.nextInt();
        d = b*b+4*a*c;
        if(d<0){
            System.out.println("Корней нет");
        }
        else if(d==0){
            x= (-b-sqrt(d))/2*a;
            System.out.println("Ваш корень: " + x);
        }
        else{
            x= (-b-sqrt(d))/2*a;
            x2= (-b+sqrt(d))/2*a;
            System.out.println("Ваши корни:" + "1) "+ x + " 2) "+x2);
            }
    }
}
