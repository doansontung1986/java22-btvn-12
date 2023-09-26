public class Bai1 {

    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số");
        for (int i = 100000; i < 1000000; i++) {
            if (checkPalindrome(String.valueOf(i))) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
