import java.util.Scanner;

public class WAITTIME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a*7 - b;
            System.out.println(result);
        }
    }

}
