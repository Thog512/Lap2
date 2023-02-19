package sochinhphuong;
import java.util.Scanner;
public class Sochinhphuong 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n bat ky: ");
        int n = input.nextInt();
        int sqr = (int) Math.sqrt(n);
        if (sqr * sqr == n) 
        {
            System.out.println(n + " la so chinh phuong");
        }else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }
}

