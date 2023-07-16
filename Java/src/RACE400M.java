import java.util.Scanner;

public class RACE400M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a<b && a<c) {
                System.out.println("Alice");
            } else if (b<c && b<a) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}
