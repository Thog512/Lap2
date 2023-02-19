package PTBAC1;
import java.util.Scanner;
public class PTBAC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, x;
        System.out.println("Nhap phuong trinh bac 1 ax + b = 0 : ");
        System.out.println("Nhap he so a: ");
        a = sc.nextFloat();
        System.out.println("Nhap he so b: ");
        b = sc.nextFloat();
        if (a != 0) {
            x = -b/a;
            System.out.println("\nPhuong trinh co nghiem x = " + x);
        } else if (b == 0) {
            System.out.println("\nPhuong trinh vo so nghiem");
        } else {
            System.out.println("\nPhuong trinh vo nghiem");
        }
    }
}