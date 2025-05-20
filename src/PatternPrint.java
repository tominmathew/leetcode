public class PatternPrint{

    public static void main(String[] args) {

        System.out.println("patternPrint()");

    }

    public static String patternPrint(){
        StringBuilder sb = new StringBuilder();
        int n = 5;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                while (0 < j && j < n){
                    sb.append(" ");
                    j++;
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
    }
    return sb.toString();
    }
}