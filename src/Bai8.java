import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        int index = s2.indexOf(s1);
        if (index != -1) {
            System.out.println("Chuỗi s1 ở vị trí thứ: " + (index + 1));
        } else {
            System.out.println("Không tìm thấy chuỗi s1 trong s2");
        }
    }
}
