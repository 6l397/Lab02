package Tasks.Main;

import Tasks.Exercise.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Оберіть номер завдання, яке ви хочете розв'язати");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String Exercise = scanner.nextLine();
            switch (Exercise) {
                case "1":
                    Task1 task1 = new Task1();
                    task1.Task1();
                    break;
                case "2":
                    Task2 task2 = new Task2();
                    task2.Task2();
                    break;
                case "3":
                    Task3 task3 = new Task3();
                    task3.Task3();
                    break;
                case "4":
                    Task4 task4 = new Task4();
                    task4.Task4();
                    break;
                case "5":
                    Task5 task5 = new Task5();
                    task5.Task5();
                    break;
                case "6":
                    Task6 task6 = new Task6();
                    task6.Task6();
                default:
                    break;
            }
        }
    }
}