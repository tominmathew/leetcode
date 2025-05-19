import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        int number = 12890;
        System.out.println(intToRoman(number));
    }

    public static String intToRoman(int number){

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i<values.length; i++){
            while (number >= values[i]) {
                roman.append(romans[i]);
                number -= values[i];
            }
        }

        return roman.toString();
    }
}
