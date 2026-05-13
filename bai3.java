package Session01;

import java.util.Scanner;

public class bai3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap tử số a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap mẫu số b: ");
        int b = scanner.nextInt();

        System.out.println("Nhap tử số c: ");
        int c = scanner.nextInt();

        System.out.println("Nhap mẫu số d: ");
        int d = scanner.nextInt();

        int tongTuSo = (a * d) + (b * c);
        int tongMauSo = b * d;

        System.out.println(a + "/" + b + " + " + c + "/" + d
                + " = " + tongTuSo + "/" + tongMauSo);
    }
}
