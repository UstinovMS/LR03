package com.company;

import java.util.Scanner;

public class Stud {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if(num>=91 && num<=100)
        {
            System.out.print("Оценка: A");
        }
        else if(num>=81 && num<=90)
        {
            System.out.print("Оценка: B");
        }
        else if(num>=71 && num<=80)
        {
            System.out.print("Оценка: C");
        }
        else if(num>=61 && num<=70)
        {
            System.out.print("Оценка: D");
        }
        else if(num>=51 && num<=60)
        {
            System.out.print("Оценка: E");
        }
        else if(num>=0 && num<=50)
        {
            System.out.print("Оценка: F");
        }
        else
        {
            System.out.print("У вас 100 бальная система");
        }
    }
}
