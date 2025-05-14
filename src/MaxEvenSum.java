import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MaxEvenSum{

    public static void main(String[] args){

        List<Integer> nums = List.of(10,3,-4,7,5,-7,1);
        List<Integer> l = new ArrayList<>(nums);
        int solution = solution(l);
        System.out.println(solution);
    }

/*
 *
 * @param nums

private static void maxEvenSumSolution(List<Integer> nums) {

    int sum = 0;
    int solution = 0;
    nums.sort((a,b) -> a.compareTo(b));
    for(int i =0; i<nums.size(); i++){
        sum = sum + nums.get(i);
        if(sum%2==0 && sum > solution){
            solution = sum;
        } else {
            nums.remove(nums.size()-1);
        }
    }
    System.out.println(solution);
}
*/

    public static int secondaryMethod(List<Integer> nums){

        Collections.sort(nums);
        int maxSum = nums.get(0);
        int currentSum = nums.get(0);


        for (int i = 1; i < nums.size(); i++){
            currentSum = Math.max(nums.get(i), currentSum + nums.get(i));
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static int solution(List<Integer> nums){
        int solution;
        int i = 0;
        do{
            solution = secondaryMethod(nums);
            nums.remove(i);
            i++;
        } while(solution % 2 != 0);

        return solution;
    }

}