package switichcase;
import java.util.Scanner;
public class Switichcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so bat ky tu 1-3: ");
        int n = scanner.nextInt();
        switch(n) 
        {
            case 1 -> System.out.println("Mot");
            case 2 -> System.out.println("Hai");
            case 3 -> System.out.println("Ba");
            default -> System.out.println("ERROR");
        }
    }
}

