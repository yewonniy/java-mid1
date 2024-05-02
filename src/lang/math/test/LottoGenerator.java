package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Integer[] lottoArray;

    public LottoGenerator() {
        Random random = new Random();
        this.lottoArray = new Integer[6];

        int i = 0;
        while (i < 6) {
            int num = random.nextInt(45) + 1;
            if (!Arrays.asList(lottoArray).contains(num)) {
                lottoArray[i] = num;
                i++;
            }
        }
    }

    public Integer[] getLottoArray() {
        return lottoArray;
    }

    @Override
    public String toString() {
        return "로또 번호: " + Arrays.toString(lottoArray);
    }

    public void printLotto() {
        System.out.print("로또 번호: ");
        for (Integer i : lottoArray) {
            System.out.print(i + " ");
        }
    }
}