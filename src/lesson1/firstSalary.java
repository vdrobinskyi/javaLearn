package lesson1;

import java.util.Scanner;

public class firstSalary {
    public static void main(String args[]){
       double salary;
       int salary2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int Hours = in.nextInt();
        System.out.print("Введите Вашу зарплату в час: ");
        int MoneyPerHour = in.nextInt();
        if(Hours <=40){
            salary2 = Hours * MoneyPerHour;
            System.out.println("Ваша зарплата: " + salary2);
        }
        else if(Hours>60){
            System.out.println("Работать больше 60 часов нельзя");
        }
        else{
            salary = Hours*MoneyPerHour*1.5;
            System.out.println("Ваша зарплата: " + salary);
        }
    }
}
