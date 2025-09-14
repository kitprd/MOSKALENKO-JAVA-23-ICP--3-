public class Main {
    public static int countVowels(String s) {
        int c = 0;
        String v = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (v.indexOf(x) != -1) {
                c++;
            }
        }
        return c;
    }
    public static int countConsonants(String s) {
        int c = 0;
        String v = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (Character.isLetter(x) && v.indexOf(x) == -1) {
                c++;
            }
        }
        return c;
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "Hello";
        String b = "топот";

        System.out.println("Слово: " + a);
        System.out.println("Гласных: " + countVowels(a));
        System.out.println("Согласных: " + countConsonants(a));
        System.out.println("Палиндром? " + isPalindrome(a));
        System.out.println();

        System.out.println("Слово: " + b);
        System.out.println("Гласных: " + countVowels(b));
        System.out.println("Согласных: " + countConsonants(b));
        System.out.println("Палиндром? " + isPalindrome(b));
    }
}
