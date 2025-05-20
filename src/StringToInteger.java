public class StringToInteger {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // Step 4: Check for overflow and clamp the result
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        // Return the final result with sign applied
        return (int) (sign * result);
    }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();

        System.out.println(stringToInteger.myAtoi("42"));              // 42
        System.out.println(stringToInteger.myAtoi("   -42"));          // -42
        System.out.println(stringToInteger.myAtoi("4193 with words")); // 4193
        System.out.println(stringToInteger.myAtoi("words and 987"));   // 0
        System.out.println(stringToInteger.myAtoi("-91283472332"));    // -2147483648 (clamped)
    }
}
