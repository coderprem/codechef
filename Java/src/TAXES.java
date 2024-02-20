import java.util.Scanner;

public class TAXES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            if(a<=100) {
                System.out.println(a);
            } else {
                System.out.println(100 - (a-100));
            }
        }
    }
}
