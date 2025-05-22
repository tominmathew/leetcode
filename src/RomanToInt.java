public class RomanToInt {

    public static void main(String[] args) {
        String number = "XXII";
        System.out.println(romanToInt(number));
    }

    public static int romanToInt(String s) {
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        int result = 0;
        while (s.length() > 0) {
            for (int j = 0; j < romans.length; j++) {
                if (s.startsWith(romans[j])) {  
                    result += values[j];  
                    s = s.substring(romans[j].length());  
                    break;  
                }
            }
        }

        return result;

    }
}
