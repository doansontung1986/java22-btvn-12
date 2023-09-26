import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi ký tự: ");
        String s;
        String[] strArr;

        do {
            s = new Scanner(System.in).nextLine();
            strArr = s.trim().split("\\s+");

            if (!checkSentenceLength(strArr)) {
                System.out.println("Chuỗi không được quá 20 từ.");
                continue;
            }

            if (checkWordLength(strArr)) {
                break;
            }

            System.out.println("Mỗi từ không quá 10 ký tự.");

        } while (true);

        System.out.println("-----------------");

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(sortString(strArr[i]) + " ");
        }
    }

    private static String sortString(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }

    private static boolean checkSentenceLength(String[] strArr) {
        return strArr.length < 21;
    }

    private static boolean checkWordLength(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > 10) {
                return false;
            }
        }
        return true;
    }
}
