/*
import java.util.Random;

*/

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 21.06.13
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */


//1.4 rnd() возвращает случайное
//целое число от 1 до 5. Реализовать rnd2() которая
//пользуясь лишь rnd() возвращает случайное целое число от 1 до 7


public class n1_4 {
    private int k = 0;

    private int rand1() {
        final Random randomGenerator = new Random();
        int i = 1 + randomGenerator.nextInt(5 + k);
        return i;
    }

    private int rand2() {
        k = 2;
        int result = rand1();
        k = 0;
        return result;
    }

    public static void main(String[] args) {
        n1_4 n = new n1_4();
        for (int i = 0; i < 100; i++) {
            System.out.println(n.rand1() + "  " + n.rand2() + " " + n.k);

        }
    }
}

