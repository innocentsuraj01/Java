import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner gra = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = gra.nextInt();
        System.out.println("Enter Second Number");
        int num2 = gra.nextInt();
        System.out.println("Enter Third Number");
        int num3 = gra.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is greater");
            else if (num2 > num3) {
                System.out.println(num2 + " is greater");
                
            }
            else 
            {
                System.out.println(num3 + " is greater");
            }
           
    }
}
