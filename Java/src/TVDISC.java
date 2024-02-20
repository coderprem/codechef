import java.util.Scanner;

public class TVDISC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println(a-c == b-d ?"Any" : a-c<b-d?"First" : "Second");
        }
    }
}
