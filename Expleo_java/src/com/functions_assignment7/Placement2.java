package com.functions_assignment7;

import java.util.Scanner;

public class Placement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CS: ");
        int cs = sc.nextInt();
        System.out.print("Enter the no of students placed in EC: ");
        int ec = sc.nextInt();
        System.out.print("Enter the no of students placed in ME: ");
        int me = sc.nextInt();
        
        validate(cs, ec, me);
        
        sc.close();
    }

    public static void validate(int cs, int ec, int me) {
        if (cs < 0 || ec < 0 || me < 0) {
            System.out.println("Input is Invalid");
            return;
        }
        
        if (cs == ec && ec == me && me==cs) {
            System.out.println("None of the department has got the highest placement");
            return;
        }
        int max = Math.max(cs, Math.max(ec, me));
        
        boolean flag = true;
        
        if (cs == max) {
            if (flag) {
                System.out.print("Highest placement CS");
                flag = false;
            } else {
                System.out.print(" CS");
            }
        }
        if (ec == max) {
            if (flag) {
                System.out.print("Highest placement EC");
                flag = false;
            } else {
                System.out.print(" EC");
            }
        }
        if (me == max) {
            if (flag) {
                System.out.print("Highest placement ME");
                flag = false;
            } else {
                System.out.print(" ME");
            }
        }
        
        System.out.println();
    }
}
