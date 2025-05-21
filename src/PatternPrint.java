public class PatternPrint {

    public static void main(String[] args) {

        System.out.println(patternPrint());

    }

    public static String patternPrint() {
        StringBuilder sb = new StringBuilder();
        int n = 5;

        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (0 < k && k < n-1 && i != 0 && i !=n-1){
                    sb.append(" ");
                    k++;
                } else{
                    sb.append("*");
                    k++;
                    }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}