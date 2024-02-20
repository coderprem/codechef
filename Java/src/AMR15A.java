import java.util.Scanner;

public class AMR15A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int odd=0;
        int even=0;
        while(t-->0){
            int a = scanner.nextInt();
            if(a%2==0) even++;
            if(a%2==1) odd++;
        }
        System.out.println(even>odd?"READY FOR BATTLE":"NOT READY");
    }
}
