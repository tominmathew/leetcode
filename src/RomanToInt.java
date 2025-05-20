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
        
                if ((s.charAt(j) == 'I') && (s.charAt(j + 1) == 'X') && (s.length() > 1)) {
                    result += 9;
                } else if ((s.charAt(j) == 'I') && (s.charAt(j + 1) == 'V') && (s.length() > 1)) {
                    result += 5;
                } else if ((s.charAt(j) == 'X') && (s.charAt(j + 1) == 'C') && (s.length() > 1)) {
                    result += 90;
                } else if ((s.charAt(j) == 'X') && (s.charAt(j + 1) == 'L') && (s.length() > 1)) {
                    result += 50;
                } else if ((s.charAt(j) == 'C') && (s.charAt(j + 1) == 'M') && (s.length() > 1)) {
                    result += 900;
                } else if ((s.charAt(j) == 'C') && (s.charAt(j + 1) == 'D') && (s.length() > 1)) {
                    result += 500;
                } else if (romans[i] == s.charAt(j)) {
                    result = result + values[i];
                    s = s.substring(j + 1);
                    i = 0;
                } else {
                    i++;
                }
            }

        return result;

    }
}
