public class LongestPrefix{
    public static void main(String[] args) {
        String[] strArray = {};
        System.out.println(longestPrefix(strArray));
    }

    public static String longestPrefix(String[] strs){
        if(strs.length==0 || strs == null){
            return "";
        }
        String prefix = strs[0];

        for(int i = 0; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}