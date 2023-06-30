import java.util.Scanner;

public class MY1STCONTEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(n-a + " " + (n-a-b));
    }
}
