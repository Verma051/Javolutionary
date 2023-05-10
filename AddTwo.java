// adding two number enter by user
import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        int a,b ;
    System.out.println("enter two nunmbers");
        Scanner obj = new Scanner(System.in);
        a= obj.nextInt();
        b= obj.nextInt();
        System.out.println("sum of two number=" + (a+b));

    }
}
