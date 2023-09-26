import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi ký tự: ");
        String s = new Scanner(System.in).nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print((s.charAt(i) + "").toUpperCase());
            } else {
                System.out.print((s.charAt(i) + "").toLowerCase() + "");
            }
        }
    }
}
