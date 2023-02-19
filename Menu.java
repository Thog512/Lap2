package menu;
import java.util.Scanner;
public class Menu 
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cac chuc nang: ");
        System.out.println("1. tinh phuong trinh bac 1");
        System.out.println("2. Tinh phuong trinh bac 2");
        System.out.println("3. tinh tien dien");
        System.out.println("4. Thoat");
        System.out.print("Moi ban chon [1-4]: ");
        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                System.out.print("nhap vao he so a : ");
                a = scanner.nextInt();
                System.out.print("nhap vao he so b : ");
                b = scanner.nextInt();
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("phuong trinh vo so nghiem");
                    } else {
                        System.out.println("phuong trinh vo nghiem");
                    }
                } else {
                    System.out.printf("phuong trinh co mot nghiem duy nhat x = %f", (float) -b / a);
                }
                break;
            }
            case 2: {
                System.out.print("nhap vao he so a : ");
                a = scanner.nextInt();
                System.out.print("nhap vao he so b : ");
                b = scanner.nextInt();
                System.out.print("nhap vao he so c : ");
                c = scanner.nextInt();

                float deta = b * b - 4 * a * c;
                if (a != 0) {
                    if (deta > 0) {
                        float x1 = (float) (-b - Math.sqrt(deta)) / (2 * a);
                        float x2 = (float) (-b + Math.sqrt(deta)) / (2 * a);
                        System.out.printf("Phuong trinh co nghiem phan biet: x1 = %.2f va x2 = %.2f", x1, x2);
                    } else if (deta == 0) {
                        System.out.printf("phuong trinh co nghiem kep x = %.2f", (float) -b / (2 * a));
                    } else {
                        System.out.println("phuong trinh vo nghiem");
                    }
                }
                break;
            }
            case 3: 
            {
                float soDien, tienDien;
                do 
                {
                    System.out.print("Nhap vao so dien cua ban (kWh): ");
                    System.out.println("\t(so dien phai lon hon 0)");
                    soDien = scanner.nextFloat();
                } while (soDien < 0);

                if (soDien <= 50) 
                {
                    tienDien = soDien * 1000;
                    System.out.printf("so tien dien su dung la: %.2f", tienDien);
                } else 
                {
                    tienDien = 50 * 1000 + (soDien - 50) * 1200;
                    System.out.printf("so tien dien su dung la: %.2f", tienDien);
                }
            }
        }
    }
}