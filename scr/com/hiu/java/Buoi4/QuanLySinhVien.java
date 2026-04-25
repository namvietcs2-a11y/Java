package com.hiu.java.Buoi4;

import java.util.ArrayList; // Đây là ArrayList của Java
import java.util.Collections;
import java.util.Scanner;

// ĐỔI TÊN LỚP TỪ ArrayList THÀNH QuanLySinhVien
public class QuanLySinhVien {

    public static void main(String[] args) {
        // Bây giờ Java đã hiểu ArrayList ở dưới là thư viện chuẩn
        ArrayList<String> dsSinhVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n---------- MENU QUẢN LÝ ----------");
            System.out.println("a. Thêm Sinh viên");
            System.out.println("b. Xuất danh sách sinh viên");
            System.out.println("c. Sửa Sinh Viên");
            System.out.println("d. Xóa Sinh viên chứa tên bất kỳ");
            System.out.println("e. Tìm Sinh viên tên có chữ 'An'");
            System.out.println("f. Sắp xếp Sinh Viên");
            System.out.println("g. Xuất ra số lượng sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn (0, a-g): ");

            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("0")) break;
            if (input.isEmpty()) continue;

            char option = input.charAt(0);

            switch (option) {
                case 'a':
                    System.out.print("Nhập tên sinh viên cần thêm: ");
                    dsSinhVien.add(sc.nextLine());
                    System.out.println("Đã thêm thành công!");
                    break;

                case 'b':
                    if (dsSinhVien.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.println("Danh sách sinh viên:");
                        for (int i = 0; i < dsSinhVien.size(); i++) {
                            System.out.println((i + 1) + ". " + dsSinhVien.get(i));
                        }
                    }
                    break;

                case 'c':
                    System.out.print("Nhập vị trí (STT) muốn sửa: ");
                    try {
                        int indexSua = Integer.parseInt(sc.nextLine()) - 1;
                        if (indexSua >= 0 && indexSua < dsSinhVien.size()) {
                            System.out.print("Nhập tên mới: ");
                            dsSinhVien.set(indexSua, sc.nextLine());
                            System.out.println("Cập nhật thành công!");
                        } else {
                            System.out.println("Vị trí không tồn tại!");
                        }
                    } catch (Exception ex) {
                        System.out.println("Vui lòng nhập số thứ tự là con số!");
                    }
                    break;

                case 'd':
                    System.out.print("Nhập tên chính xác muốn xóa: ");
                    String tenXoa = sc.nextLine();
                    if (dsSinhVien.remove(tenXoa)) {
                        System.out.println("Đã xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy tên '" + tenXoa + "' trong danh sách!");
                    }
                    break;

                case 'e':
                    System.out.println("Các sinh viên có tên chứa 'An':");
                    boolean found = false;
                    for (String sv : dsSinhVien) {
                        if (sv.toLowerCase().contains("an")) {
                            System.out.println("- " + sv);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Không có sinh viên nào tên chứa 'An'.");
                    break;

                case 'f':
                    Collections.sort(dsSinhVien);
                    System.out.println("Đã sắp xếp danh sách từ A-Z.");
                    break;

                case 'g':
                    System.out.println("Tổng số sinh viên: " + dsSinhVien.size());
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (true);

        System.out.println("Tạm biệt!");
        sc.close();
    }
}