import java.util.Scanner;

public class PASSTHEEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(((a+b+c>=100) && a>=10 && b>=10 && c>=10) ? "PASS" : "FAIL");
        }
    }
}
