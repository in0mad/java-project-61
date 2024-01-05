package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("What is the result of the expression?.");
        int rightAnswers = 0;
        int answer;
        for (int i = 0; i < Engine.defineRoundCount(); i++) {
            // рандомные операнды
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();
            // переменная результата операций
            char operator = Engine.getRandomOperator();
            int arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
            // основная логика игры
            System.out.printf("Question: %d %c %d\n", randomNum1, operator, randomNum2);
            System.out.print("Your answer: ");
            answer = Engine.getIntAnswer();
            if (operator == '-' && randomNum1 - randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '+' && randomNum1 + randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '*' && randomNum1 * randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '-' && randomNum1 - randomNum2 != answer) {
                Engine.callFaultMessage(answer, arithmeticResult, username);
                break;
            } else if (operator == '+' && randomNum1 + randomNum2 != answer) {
                Engine.callFaultMessage(answer, arithmeticResult, username);
                break;
            } else if (operator == '*' && randomNum1 * randomNum2 != answer) {
                Engine.callFaultMessage(answer, arithmeticResult, username);
                break;
            }
        }
        if (rightAnswers == Engine.defineRoundCount()) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    public static int makeArithmeticResult(char operator, int num1, int num2) {
        int arifmeticResult = 0;
        switch (operator) {
            case '-':
                arifmeticResult = num1 - num2;
                break;
            case '+':
                arifmeticResult = num1 + num2;
                break;
            case '*':
                arifmeticResult = num1 * num2;
                break;
            default:
                break;
        }
        return arifmeticResult;
    }
}
