package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void sayHello () {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
        scanner.close();
    }
    public static String getName () {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
//        scanner.close();  #не понимаю, почему при открытии тут сканера, появляется ошибка при запуске аппы
        return userName;
    }
}
