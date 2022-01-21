
package com.company;

import java.util.Scanner;

public class Less {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if(num > 100){
            System.out.print("less");
        }
        else{
            System.out.print("not less");
        }
    }
}
