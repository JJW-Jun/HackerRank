package demo.book.coderefactoring.chapter3.sortsample.goodcode;

import demo.book.coderefactoring.chapter3.sortsample.badcode.SortSample;

import java.util.Random;

public class MainG {
    private static final Random random = new Random(1234);

    private static void execute(int length) {
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length);
        }

        SortSampleG sortSampleG = new SortSampleG(data);
        System.out.println("BEFORE:" + sortSampleG);

        sortSampleG.sort();

        System.out.println("AFTER:" + sortSampleG);
        System.out.println();
    }


    public static void main(String args[]) {
        execute(15);

    }
}
