public class PatternMatch {
    public static void main(String[] args) {
        
    String string = "string";
    String pattern = "str..g";

    System.out.println(isMatch(string, pattern));
    }

    public static boolean isMatch(String s, String p) {
    boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    dp[s.length()][p.length()] = true;

    for (int i = s.length(); i >= 0; i--) {
        for (int j = p.length() - 1; j >= 0; j--) {
            boolean firstMatch = (i < s.length() &&
                                  (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                dp[i][j] = dp[i][j + 2] || (firstMatch && dp[i + 1][j]);
            } else {
                dp[i][j] = firstMatch && dp[i + 1][j + 1];
            }
        }
    }
    return dp[0][0];
}


}
