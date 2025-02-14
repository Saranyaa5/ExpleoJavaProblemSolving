package com.java_Core_Assignment;

import java.util.Scanner;

class ConcatExample {
    public void concat1(String s1) {
        s1 = s1 + "ram"; 
    }
    public void concat2(StringBuilder s1) {
        s1.append("ram");
    }
    public void concat3(StringBuffer s1) {
        s1.append("ram");
    }
}

public class StringBufferSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConcatExample obj = new ConcatExample();

        String str = "hello";
        obj.concat1(str);
        System.out.println("String: " + str);
        StringBuilder sb1 = new StringBuilder("hello");
        obj.concat2(sb1);
        System.out.println("StringBuilder: " + sb1);
        StringBuffer sb2 = new StringBuffer("hello");
        obj.concat3(sb2);       
        System.out.println("StringBuffer: " + sb2);

        sc.close();
    }
}
