package tiendien;
import java.util.Scanner;
public class Tiendien {
    public static void main(String[] args) {
        float sodien, tien;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhap vao so dien cua ban (kWh): ");
            System.out.println("\t*so dien khong duoc nho hon 0*");
            sodien = scanner.nextFloat();
        } while (sodien < 0);

        if (sodien < 50) {
            tien = sodien * 1000;
            System.out.printf("so tien phai tra la: %.2f", tien);
        } else {
            tien = 50 * 1000 + (sodien - 50) * 1200;
            System.out.printf("so tien phai tra la: %.2f", tien);
        }
    }
}

