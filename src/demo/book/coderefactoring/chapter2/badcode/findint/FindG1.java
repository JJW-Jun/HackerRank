package demo.book.coderefactoring.chapter2.badcode.findint;

public class FindG1 {
    public static boolean find(int[] data, int target) {
        // 알기 쉽게 변수명 변경
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        // 출구는 여러개 있어도 된다.
        return false;
    }
}
