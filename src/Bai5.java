import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập họ đệm tên: ");
        String s = new Scanner(System.in).nextLine();
        String[] strArr = s.trim().split("\\s+");
        System.out.println(strArr[2] + " " + strArr[0] + " " + strArr[1]);
    }
}
