import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(average(Float.parseFloat(scan.nextLine()), Float.parseFloat(scan.nextLine()), Float.parseFloat(scan.nextLine())));
        scan.close();
    }
    private static String average(float firstNum, float secondNum, float thirdNum){
        float result = (firstNum + secondNum + thirdNum) / 3;
        return String.format("%.2f", result);
    }
}
