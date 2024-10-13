import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a = 2;
        int b = -4;
        int c = 40;

        int positive = 0;
        int negative = 0;

        if (a >= 0) {
            positive +=1;
        } else {
            negative +=1;
        }
        if (b >= 0) {
            positive +=1;
        } else {
            negative +=1;
        }
        if (c >= 0) {
            positive +=1;
        } else {
            negative +=1;
        }

        System.out.println("Положительных: " + positive);
        System.out.println("Отрицательных: " + negative);
    }
}
