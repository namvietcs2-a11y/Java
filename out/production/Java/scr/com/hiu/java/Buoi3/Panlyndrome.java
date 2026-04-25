package com.hiu.java.Buoi3;

public class Panlyndrome {
        // Phương thức kiểm tra chuỗi Panlyndrome
        public static boolean Panlyndrome(String str) {
            // Nếu chuỗi rỗng hoặc null thì không phải
            if (str == null) {
                return false;
            }

            int n = str.length();
            // Vòng lặp chạy từ đầu đến giữa chuỗi
            for (int i = 0; i < n / 2; i++) {// So sánh ký tự ở vị trí i và vị trí đối xứng n - 1 - i
                if (str.charAt(i) != str.charAt(n - 1 - i)) {
                    return false; // Nếu có 1 cặp không giống nhau, trả về false ngay
                }
            }

            // Nếu duyệt qua hết mà không có cặp nào khác nhau thì là chuỗi Panlyndrome
            return true;
        }

        public static void main(String[] args) {
            // Kiểm tra thử với các ví dụ
            System.out.println("madam: " + Panlyndrome("madam")); // true
            System.out.println("radar: " + Panlyndrome("radar")); // true
            System.out.println("hello: " + Panlyndrome("hello")); // false
        }
    }


