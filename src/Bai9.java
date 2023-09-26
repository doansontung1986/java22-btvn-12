import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();
        String result = insertString(s1, s2, 3);
        System.out.println(result);
    }

    private static String insertString(String s1, String s2, int k) {
        StringBuilder sb = new StringBuilder(s2);
        sb.insert(k, s1);
        return sb.toString();
    }
}
