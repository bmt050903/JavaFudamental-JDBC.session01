package Session01;

import java.util.Scanner;

public class bai4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều rộng: ");
        double  width = scanner.nextDouble();

        System.out.println("Nhập chiều cao: ");
        double  height  = scanner.nextDouble();

        double dienTich =  width * height;
        double chuVi =  (width + height) * 2;
        System.out.println("Diện tích hcn: " + dienTich);
        System.out.println("Chu vi hcn: " + chuVi);

    }
}
