import java.util.Scanner;

public class CARTRIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            System.out.println((a<=300) ? 3000 : 3000 + (a-300)*10);
        }
    }
}
