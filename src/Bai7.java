import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        if (s1.contains(s2)) {
            s1 = s1.replace(s2, "");
        }

        System.out.println(s1);
    }
}