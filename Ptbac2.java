package Ptbac2;
import java. util.Scanner;
public class Ptbac2
{ 
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner(System.in); 
        float a, b, c, D, x1, x2; 
        System.out.println("Nhap cac cac so a, b, c:"); 
        a = scanner.nextFloat(); 
        b = scanner.nextFloat(); 
        c = scanner.nextFloat(); 
        if(a == 0) 
        {
            if(b == 0) 
        { 
            if(c == 0) 
            { 
                System.out.println("Phuong trinh VSN"); 
            } 
            else 
            { 
                System.out.println("Phuong trinh VN"); 
            } 
        } 
        else { x1= (-c)/b; 
        System.out.println("Phuong trinh co nghiem x= "+x1);
        } 
        } 
        else 
        { 
            D = b*b-4*a*c; 
        if(D<0) 
        {
            System.out.println("Phuong trinh VN"); 
        } 
        else if (D == 0) 
        { 
            x1= (-b)/(2*a); 
            System.out.println("Phuong trinh co nghiem kep: x= "+x1); 
        }
        else 
        { 
            x1= (-b + (float)Math.sqrt(D)) / (2 * a);
            x2= (-b - (float)Math.sqrt(D)) / (2 * a); 
            System.out.println("Phuong trinh co 2 ngiem phan biet: x1= "+x1+"\tx2= "+x2); 
        }
        }
    }
}
