package Tasks.Exercise;
import java.util.Scanner;

public class Task6 {
    public void Task6 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість років від 20 до 69 включно");
        int n = scan.nextInt();
        if (n >= 20 && n<=69) {
            if ((n % 10 == 0) || (n > 4 && n <= 20) || (n % 10 >= 5)) {
                System.out.println("Вам " + n + " років.");
            } else if (n % 10 == 1) {
                System.out.println("Вам " + n + " рік.");
            } else if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4) {
                System.out.println("Вам " + n + " роки.");
            }
        }
        else {
            System.out.println("Щось пішло не так. Спробуйте ще раз");
        }
    }
}
