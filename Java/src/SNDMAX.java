import java.util.Scanner;

public class SNDMAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int result = ((a<b && a>c) || (a>b && a<c)) ? a : ((b>a && b<c) || (b<a && b>c)) ? b : c;
        }
    }
}
