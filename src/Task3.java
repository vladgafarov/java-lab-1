import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter int number:");
        Scanner sc = new Scanner(System.in);

        if(sc.nextInt() > 10) {
            System.out.println("More than 10");
        } else {
            System.out.println("Less or equal to 10");
        }
    }
}
