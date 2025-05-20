import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeating {
    public static void main(String[] args){
        String string = "swiss";
        System.out.println(firstNonRepeating(string));
    }
    public static String firstNonRepeating(String string){
        List<Character> set = new ArrayList<>();
        for(Character c : string.toCharArray()){
            if(!set.contains(c)){
               set.add(c);
            } else {
                set.remove(c);
            }
        }

        return set.getFirst().toString();
    }
}
