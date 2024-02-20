import java.util.Scanner;

public class DETSCORE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println((x/10)*n);
        }
    }
}
