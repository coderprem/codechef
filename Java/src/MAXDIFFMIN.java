import java.util.Scanner;

public class MAXDIFFMIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(Math.max(Math.max(a,b), Math.max(a,c)) - Math.min(Math.min(a,b),Math.min(a,c)));
        }
    }
}
