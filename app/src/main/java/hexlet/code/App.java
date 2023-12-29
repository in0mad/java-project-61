package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String gameMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                """;
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameChoose = sc.nextInt();
        switch (gameChoose) {
            case 1:
                Engine.sayHello();
                break;
            case 2:
                Even.startTheGame();
                break;
            case 3:
                Calc.startTheGame();
                break;
            default:
                break;
        }
        sc.close();
    }
}
