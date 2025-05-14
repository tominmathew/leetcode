public class SecondSmallestNo {

    public static void main(String[] args) {
        int numbers[] = { 5, 6, 2, 9, 8, 3 };
        System.out.println(secondNumber(numbers));

    }

    private static int secondNumber(int[] numbers) {
        int smallestNo = numbers[0];
        int secondNo = numbers[0];
        for (int number : numbers) {
            if (number < smallestNo) {

                secondNo = smallestNo;
                smallestNo = number;

            } else if (number != smallestNo && number < secondNo) {
                secondNo = number;
            }
        }
        return secondNo;
    }

}
