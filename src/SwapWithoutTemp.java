class SwapWithoutTemp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Orginal a: " + a + ", Original b: " + b);

        SwapWithoutTemp swap = new SwapWithoutTemp();

        swap.swapWithoutTemp(a, b);

    }

    public void swapWithoutTemp(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped a: " + a + ", Swapped b: " + b);

    }

}