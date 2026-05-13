package Session01;

import java.util.Scanner;

public class bai2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập sô thứ nhất: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Nhập số thứ hai: ");
        int secondNumber = scanner.nextInt();

        int tong = firstNumber + secondNumber;
        int hieu = firstNumber - secondNumber;
        int tich = firstNumber * secondNumber;
        int thuong = firstNumber / secondNumber;
        int phanDu = firstNumber % secondNumber;

        System.out.println("--- Kết quả ---");
        System.out.println("firstNumber: " + firstNumber );
        System.out.println("secondNumber: " + secondNumber );
        System.out.println("Tổng: " + secondNumber );
        System.out.println("Hiệu: " + hieu );
        System.out.println("Tích: " + tich );
        System.out.println("Thương: " + thuong );
        System.out.println("Phần dư: " + phanDu );

        scanner.close();
    }
}
