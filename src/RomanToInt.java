public class RomanToInt {

    public static void main(String[] args) {
        String number = "XXII";
        System.out.println(romanToInt(number));
    }

    public static int romanToInt(String s) {        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentValue = getRomanValue(s.charAt(i));
            
            if (i + 1 < s.length() && currentValue < getRomanValue(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
    
    private static int getRomanValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
