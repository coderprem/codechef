import java.util.Scanner;

public class CHEFGAMES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a==b && a==c && a==d && a==0) {
                System.out.println("In");
            } else {
                System.out.println("Out");
            }
        }
    }
}
