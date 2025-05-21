public class StringToInteger {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

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

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();

        System.out.println(stringToInteger.myAtoi("42"));        
        System.out.println(stringToInteger.myAtoi("   -42"));          
        System.out.println(stringToInteger.myAtoi("4193 with words")); 
        System.out.println(stringToInteger.myAtoi("words and 987"));  
        System.out.println(stringToInteger.myAtoi("-91283472332"));    
    }
}
