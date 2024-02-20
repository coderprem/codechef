import java.util.Scanner;

public class CHEFCAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int answer = 0;
            if (a>b) {
                if ((a-b)%4 == 0) {
                    answer = (a-b)/4;
                } else {
                    answer = ((a-b)/4) + 1;
                }
            }
            System.out.println(answer);
        }
    }
}
