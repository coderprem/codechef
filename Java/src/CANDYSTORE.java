import java.util.Scanner;

public class CANDYSTORE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((a>=b) ? b : (a + (b-a)*2));
        }
    }
}
