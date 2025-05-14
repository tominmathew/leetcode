public class Sorting {

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,8,2,0,9};

        int[] result = sortMethod(arr);

        for(int j = 0; j < result.length; j++){
            System.out.println(result[j]);
        }
    }

    public static int[] sortMethod(int[] array){
        int temp;
        int first;
        int second;
        for( int i=0; i<array.length-1;){
            first = array[i];
            second = array[i+1];
            if(first<second){
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                i = 0;
            } else {
                i++;
            }

        }
        return array;
    }

}
