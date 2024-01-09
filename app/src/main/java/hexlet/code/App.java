package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        String gameMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """;
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameChoose = sc.nextInt();
        switch (gameChoose) {
            case GREET_GAME:
                System.out.println(Engine.getName());
                break;
            case EVEN_GAME:
                Even.startTheGame();
                break;
            case CALC_GAME:
                Calc.startTheGame();
                break;
            case GCD_GAME:
                Gcd.startTheGame();
                break;
            case PROGRESSION_GAME:
                Progression.startTheGame();
                break;
            case PRIME_GAME:
                Prime.startTheGame();
                break;
            default:
                break;
        }
        sc.close();
    }
}
