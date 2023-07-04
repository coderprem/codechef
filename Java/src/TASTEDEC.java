import java.util.Scanner;

public class TASTEDEC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (2*a>5*b) ? "Chocolate" : (2*a<5*b) ? "Candy" : "Either";
            System.out.println(result);
        }
    }
}
