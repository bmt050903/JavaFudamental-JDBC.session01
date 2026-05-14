package Session01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cân năng(kg): ");
        double canNang = scanner.nextDouble();

        System.out.println("Nhập cân chiều cao(m): ");
        double chieuCao = scanner.nextDouble();

        double BMI = canNang / (chieuCao * chieuCao);

        System.out.printf("Chỉ số BMI = %.2f", BMI);

        scanner.close();
    }
}
