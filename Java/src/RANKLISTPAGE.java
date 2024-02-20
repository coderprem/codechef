import java.util.Scanner;

public class RANKLISTPAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            if (a<=25) {
                System.out.println(1);
            } else {
                int answer = a/25;
                if (a%25==0) {
                    System.out.println(answer);
                } else {
                    System.out.println(answer+1);
                }
            }
        }
    }
}
