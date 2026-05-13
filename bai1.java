package Session01;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.printf("Diện tích hình tròn là: %.2f", area);

        scanner.close();
    }
}