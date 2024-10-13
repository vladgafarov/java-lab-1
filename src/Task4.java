import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Программа для расчета дохода по накопительному счету");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите процентную ставку:");
        double interestRate = 0;
        try {
            interestRate = scanner.nextFloat();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ожидается число");
        }

        System.out.println("Введите сумму:");
        double sum = 0;
        try {
            sum = scanner.nextFloat();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ожидается число");
        }

        double yearInterestRate = (Math.pow(1 + interestRate/100/12, 12) - 1) * 100;
        double incomeInMonth = interestRate / 12 / 100 * sum;
        double incomeInYear = yearInterestRate / 100 * sum;

        System.out.println("Доход в месяц:" + incomeInMonth);
        System.out.println("Процент за год с учетом капитализации:" + yearInterestRate + '%');
        System.out.println("Доход за год с учетом капитализации:" + incomeInYear);
    }
}
