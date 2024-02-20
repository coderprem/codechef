import java.util.Scanner;

public class ACCURACY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            if (a%3==0) {
                System.out.println(0);
            } else if (a%3==1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
