import java.util.Scanner;

public class THREETOPICS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a==d? "YES" : b==d?"YES" : c==d?"YES" :"NO");
    }
}
