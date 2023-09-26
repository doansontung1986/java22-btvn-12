import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        if (s2.contains(s1)) {
            int index = s2.indexOf(s1);
            String result = deleteString(s1, s2, index);
            System.out.println(result);
        } else {
            System.out.println("Chuỗi s2 không chứa s1");
        }
    }

    private static String deleteString(String s1, String s2, int index) {
        StringBuilder sb = new StringBuilder(s2);
        sb.delete(index, index + s1.length());
        return sb.toString();
    }
}
