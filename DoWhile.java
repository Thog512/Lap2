package DoWhile;
import java.util.Scanner;
public class DoWhile 
{


    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen bat ky: ");
        n = scanner.nextInt();
        int ketqua = 1;
        int i = 1;
        do 
        {
            ketqua = ketqua * i;
            i++;
        } while (i <= n);
        System.out.printf("\nGiai thua cua n la: %d", ketqua);
    }
}