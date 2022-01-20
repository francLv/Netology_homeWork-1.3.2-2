// * Сколько дней в году
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int dayTrue;
        boolean win = true;
        while (win) {
            System.out.println("Введите год и число дней: ");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            year = leap(year);
            if ((days == 366 && year == 1) || (days == 365 && year == 0)) {
                score++;
            } else { if (year == 1) {
                dayTrue = 366;
                } else { 
                  dayTrue = 365;
            }
                System.out.println("Неправильно! В этом году " + dayTrue + " дней");
                System.out.println("Score: " + score);
                win = false;
            }
        }
    }
    public static int leap(int ye) {
        if (ye % 400 == 0 || ye % 4 == 0 && ye % 100 != 0) {
            ye = 1; // Високосный год
        } else ye = 0; // Обычный год
        return ye;
    }
}










