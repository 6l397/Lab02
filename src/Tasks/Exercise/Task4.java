package Tasks.Exercise;

import java.util.Scanner;

public class Task4 {
    public void Task4() {
        System.out.println("Уведіть число від 1001 до 9998 включно, щоб визначити чи є воно паліндромом");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 1000 && n < 9999) {
            int c1 = n / 1000;
            int c2 = (n % 1000) / 100;
            int c3 = (n % 100) / 10;
            int c4 = n % 10;
            if (c1 == c4 && c2 == c3) {
                System.out.println("Це паліндром");
            } else {
                System.out.println("Це не паліндром");
            }
        }
        else {
            System.out.println("Уведіть інше число");
            }
        }
    }
