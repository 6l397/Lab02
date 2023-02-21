package Tasks.Exercise;
import java.util.Scanner;

public class Task2 {
        public void Task2() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введіть значення x");
            double x = scan.nextDouble();
            System.out.println("Введіть значення y");
            double y = scan.nextDouble();
            if (x < 0 && y < 0)
            {
                System.out.println("Обидва значення менше нуля, x = " + Math.abs(x) + " y = " + Math.abs(y));
            } else if (x < 0 || y < 0) {
                System.out.println("Одне із значень менше нуля. х = " + (x+1) + " y = " + (y+1));
            } else if (x >= 2 && x <= 9 && y >= 2 && y <= 9) {
                System.out.println("Обидва значення належать відрізку [2, 9]. х = " + (x/10) + " y = " + (y/10));
            }
            else {
                System.out.println("Обидва значення більше 9. x = " + x + " y = " + y);
            }
        }
    }

