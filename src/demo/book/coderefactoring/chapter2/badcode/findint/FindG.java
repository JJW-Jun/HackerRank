package demo.book.coderefactoring.chapter2.badcode.findint;

public class FindG {
    public static boolean find(int[] data, int target) {
        // 알기 쉽게 변수명 변경
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                found = true;
                break;
            }
        }
        return found;
    }
}
