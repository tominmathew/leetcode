public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 5, 7, 3, 4, 9, 1 };
        int[] sortedArray = bubbleSort(numbers);

        for (int array : sortedArray) {

            System.out.println(array + " ");
        }
    }

    private static int[] bubbleSort(int[] numbers) {
        int temp;
        int length = numbers.length;
        boolean swapped;
        for (int j = 0; j < length - 1; j++) {
            swapped = false;
            for (int i = 0; i < length - j - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return numbers;
    }



}