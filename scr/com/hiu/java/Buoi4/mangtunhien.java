package com.hiu.java.Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class mangtunhien {

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] M = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = sc.nextInt();
        }

        // Tạo các danh sách để chứa kết quả lọc
        ArrayList<Integer> soLe = new ArrayList<>();
        ArrayList<Integer> soChan = new ArrayList<>();
        ArrayList<Integer> snt = new ArrayList<>();
        ArrayList<Integer> koSnt = new ArrayList<>();

        // 2. Phân loại dữ liệu
        for (int x : M) {
            // Lọc chẵn lẻ
            if (x % 2 != 0) {
                soLe.add(x);
            } else {
                soChan.add(x);
            }

            // Lọc số nguyên tố
            if (laSoNguyenTo(x)) {
                snt.add(x);
            } else {
                koSnt.add(x);
            }
        }

        // 3. Xuất kết quả ra màn hình
        System.out.println("\n--- KẾT QUẢ ---");

        System.out.print("Dòng 1: Các số lẻ: ");
        for(int x : soLe) System.out.print(x + " ");
        System.out.println("-> Tổng cộng có " + soLe.size() + " số lẻ.");

        System.out.print("Dòng 2: Các số chẵn: ");
        for(int x : soChan) System.out.print(x + " ");
        System.out.println("-> Tổng cộng có " + soChan.size() + " số chẵn.");

        System.out.println("Dòng 3: Các số nguyên tố: " + snt);
        System.out.println("Dòng 4: Các số không phải là số nguyên tố: " + koSnt);

        sc.close();
    }
}