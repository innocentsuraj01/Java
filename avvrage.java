import java.util.Scanner;

public class avvrage {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = var.nextInt();
        System.out.println("Enter Second Number");
        int num2 = var.nextInt();
        System.out.println("Enter Third Number");
        int num3 = var.nextInt();
        float avg = (float) (num1 + num2 + num3)/3;
        System.out.println(avg);
        var.close();
    
    }

}
