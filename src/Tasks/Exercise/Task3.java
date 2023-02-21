package Tasks.Exercise;
import java.util.Scanner;

public class Task3 {
    public void Task3 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть першу сторону трикутника");
        int a = scan.nextInt();
        System.out.println("Введіть другу сторону трикутника");
        int b = scan.nextInt();
        System.out.println("Введіть третю сторону трикутника");
        int c = scan.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Такий трикутник існує.");
            if (a == b || b == c || a == c) {
                System.out.println("Це рівнобедренний трикутник.");
            } else if (a == b && a == c) {
                System.out.println("Це рівносторонній трикутник.");
            } else if (Math.pow(a, 2) == Math.pow(b, 2)+Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2)+Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(c, 2)+Math.pow(a, 2)); {
                System.out.println("Це прямокутний трикутник. ");
            }
        } else {
            System.out.println("Такого трикутника не існує");
        }
    }
}
