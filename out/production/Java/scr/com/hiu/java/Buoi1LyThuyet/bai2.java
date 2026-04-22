package com.hiu.java.Buoi1LyThuyet;
import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        // Biện luận
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm (PTVSN).");
                } else {
                    System.out.println("Phương trình vô nghiệm (PTVN).");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm (PTVN).");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}