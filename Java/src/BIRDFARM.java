import java.util.Scanner;

public class BIRDFARM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (c%a==0 && c%b==0) {
                System.out.println("Any");
            } else if (c%a==0 && c%b!=0) {
                System.out.println("Chicken");
            } else if (c%a!=0 && c%b==0) {
                System.out.println("Duck");
            } else {
                System.out.println("None");
            }
        }
    }
}
