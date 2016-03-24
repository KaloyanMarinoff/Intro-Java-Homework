import java.util.Scanner;

public class PrintCharTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        scan.close();

        for(int lin = 0; lin < n; lin ++) {
            for (char ch = 'a'; ch != 'a' + lin; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        for(int lin =  n; lin > 0; lin --) {
            for (char ch = 'a'; ch != 'a' + lin; ch++){
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }
}
