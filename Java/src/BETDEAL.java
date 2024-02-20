import java.util.Scanner;

public class BETDEAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int first = 100-a;
            int second = 200-(2*b);
            if (first==second) {
                System.out.println("Both");
            } else if (first<second) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
