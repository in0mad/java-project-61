package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber() {
        Random randNum = new Random();
        int defaultStartNum = 1;
        int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
    public static int getRandomRangeNumber(int start, int end) {
        Random randNum = new Random();
        return randNum.nextInt(start, end);
    }
}
