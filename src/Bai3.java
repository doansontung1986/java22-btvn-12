import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi ký tự: ");
        String s = new Scanner(System.in).nextLine();
        String[] strArr = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String value : strArr) {
            result.append(value.substring(0, 1).toUpperCase()).append(value.substring(1).toLowerCase()).append(" ");
        }

        System.out.println(result);
    }
}
