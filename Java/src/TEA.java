import java.util.Scanner;

public class TEA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a%b==0) {
                System.out.println((a/b)*c);
            } else {
                int temp = a/b;
                System.out.println((temp+1)*c);
            }
        }
    }
}
