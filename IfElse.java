package IfElse;
import java.util.Scanner;
public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dQT, dT, dtb;
        System.out.print("Nhap diem qua trinh: ");
        dQT = sc.nextFloat();
        System.out.print("Nhap diem thi: ");
        dT = sc.nextFloat();
        dtb= dQT*40/100 + dT*60/100;
        if(dtb<4) {
            System.out.println("F");
        } else if(dtb<5.5) {
            System.out.println("D");
        } else if(dtb<7) {
            System.out.println("C");
        } else if(dtb<8.5) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}

