import java.util.Scanner;

public class EXPERT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            float a = scanner.nextInt();
            float b = scanner.nextInt();
            System.out.println(b>=a*0.5?"Yes":"No");
        }
    }
}
