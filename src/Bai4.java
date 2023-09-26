import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi ký tự: ");
        String s = new Scanner(System.in).nextLine();
        String[] strArr = s.trim().split("\\s+");
        int max = strArr[0].length();
        int index = -1;

        for (int i = 0; i < strArr.length; i++) {
            if (max < strArr[i].length()) {
                max = strArr[i].length();
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Từ dài nhất trong chuỗi ký tự ở vị trí thứ " + (index + 1) + ": " + strArr[index]);
        }
    }
}
