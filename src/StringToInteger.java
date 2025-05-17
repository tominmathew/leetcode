public class StringToInteger{
    public static void main(String[] args) {
        String string = "  -  -124";
        System.out.println(myAtoi(string));
    }

    public static int myAtoi(String s) {

     int sign = 1;
     int result = 0;
     boolean numberStarted = false;
     boolean signSet = false;

     for(char c : s.toCharArray()){
        if(c == ' ' && !signSet && !numberStarted){
            continue;
        } else if ((c == '-' || c == '+') && !signSet && !numberStarted){
            sign = (c == '-') ? -1 : 1;
            signSet = true;
        } else if (Character.isDigit(c)){
            int digit = c - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            result = (result*10)+digit;
            numberStarted = true;
        } else {
            break;
        }
     }

            return result*sign;
        }
}