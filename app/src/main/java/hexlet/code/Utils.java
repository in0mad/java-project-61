package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT_START_NUM = 1;
    private static final int DEFAULT_END_NUM = 100;
    public static int getRandomNumber() {
        return getRandomNumber(DEFAULT_START_NUM, DEFAULT_END_NUM);
    }

    public static int getRandomNumber(int start, int end) {
        Random randNum = new Random();
        return randNum.nextInt(start, end);
    }
}
