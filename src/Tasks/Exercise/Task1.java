package Tasks.Exercise;
import java.util.Scanner;

public class Task1 {
    public void Task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть свою оцінку з Вищої математики");
        int higherMath = scan.nextInt();
        System.out.println("Введіть свою оцінку з Програмування");
        int programming = scan.nextInt();
        System.out.println("Введіть свою оцінку з Філософії");
        int philosophy = scan.nextInt();
        int mark = philosophy + programming + higherMath;
        if (mark >= 14) {
            System.out.println("Ви отримуєте підвищену стипендію - 1790 грн");
        } else if (mark >= 12) {
            System.out.println("Ви отримуєте звичайну стипендію - 1400 грн");
        } else {
            System.out.println("Ви не отримуєте стипендію");
        }
    }
}