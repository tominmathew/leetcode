class TwoSum {
    public static void main(String[] args) {
        int[] array = { 8, 7, 1, 5, 3 };
        int targetSum = 9;
        twoSum(array, targetSum);
        fastSolution(array, targetSum);
    }

    public static void twoSum(int[] nums, int target) {
        int i;
        int[] solution = { 0, 0 };
        for (i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    solution[0] = i;
                    solution[1] = j;
                    System.out.println("MySolution: " + "{" + i + "," + j + "}");
                }
            }
        }
    }

    public static void fastSolution(int[] nums, int target) {
        outerLoop: for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    System.out.println("FastestSolution: " + "{" + j + "," + (j - i) + "}");
                    break outerLoop;
                }
            }
        }

    }
}