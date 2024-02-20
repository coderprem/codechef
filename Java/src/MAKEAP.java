import java.util.Scanner;

public class MAKEAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int answer = (a+b);
            if (answer%2==0) {
                System.out.println(answer/2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
