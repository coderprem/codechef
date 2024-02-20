import java.util.Scanner;

public class PRACTICEPERF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<4;i++) {
            int a = scanner.nextInt();
            if(a>=10) sum++;
        }
        System.out.println(sum);
    }
}
