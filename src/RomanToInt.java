public class RomanToInt {

    public static void main(String[] args) {
        String number = "XXII";
        System.out.println(romanToInt(number));
    }

    public static int romanToInt(String s) {
        int[] values = { 1, 5, 10, 50, 100, 500, 1000 };
        Character[] romans = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

        int result = 0;
        int j = 0;

        for (int i = 0; i < romans.length - 1;) {
            while (s.length() > 1 && j + 1 < s.length()) {
                if ((s.charAt(j) == 'I') && (s.charAt(j + 1) == 'X')) {
                    result += 9;
                } else if ((s.charAt(j) == 'I') && (s.charAt(j + 1) == 'V')) {
                    result += 5;
                } else if ((s.charAt(j) == 'X') && (s.charAt(j + 1) == 'C')) {
                    result += 90;
                } else if ((s.charAt(j) == 'X') && (s.charAt(j + 1) == 'L')) {
                    result += 50;
                } else if ((s.charAt(j) == 'C') && (s.charAt(j + 1) == 'M')) {
                    result += 900;
                } else if ((s.charAt(j) == 'C') && (s.charAt(j + 1) == 'D')) {
                    result += 500;
                } else {
                    break;
                }
            }
                if (romans[i] == s.charAt(j)) {
                    result = result + values[i];
                    s = s.substring(1);
                    i = 0;
                } else {
                    i++;
                }
            }

        return result;

    }
}
