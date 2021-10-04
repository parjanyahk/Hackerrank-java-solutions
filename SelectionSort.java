public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1, 5, 2, 7};
        sort(arr);
        for (int el: arr) {
            System.out.print(el + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
