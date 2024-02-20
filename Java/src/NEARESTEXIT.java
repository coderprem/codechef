import java.util.Scanner;

public class NEARESTEXIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            if (a<=50) {
                System.out.println("Left");
            } else {
                System.out.println("Right");
            }
        }
    }
}
