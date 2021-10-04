class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 10, 3, 0, 4};
        System.out.println(search(arr, 0));
    }

    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}