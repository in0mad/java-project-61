package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String gameMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                """;
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameChoose = sc.nextInt();
        switch (gameChoose) {
            case 1:
                Greet.sayHello();
                break;
            case 2:
                Even.startTheGame();
                break;
            default:
                break;
        }
        sc.close();
    }
}
