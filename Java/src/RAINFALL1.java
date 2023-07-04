import java.util.Scanner;

public class RAINFALL1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            String result = n<3 ? "LIGHT" : n<7 ? "MODERATE" : "HEAVY";
            System.out.println(result);
        }
    }
}
