package Tasks.Exercise;

import java.util.Scanner;

public class Task5 {
    public void Task5() {
        System.out.println("Уведіть номер місяця, щоб побачити кількість днів у ньому");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
                System.out.println("У цьому місяці 31 день");
        } else if (month == 2) {
            System.out.println("У цьому місяці 28 днів");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("У цьому місяці 30 днів");
        }
        else {
            System.out.println("Щось пішло не так. Спробуйте ще раз");
        }
    }
}
