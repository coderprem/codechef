import java.util.Scanner;

public class SPECIALITY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println((a>b && a>c) ? "Setter" : (b>a && b>c) ? "Tester" : "Editorialist");
        }
    }
}
