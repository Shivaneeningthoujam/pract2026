package Arrays;

public class reverseArr {
    // To reverse an array
    public static int[] revA(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            // arr[i] = arr[n - 1];
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
        return arr;
    }

    // To sort 0s,1s,2s in an array
    static int[] sort(int arr[]) {
        // get the counts of 0,1,2
        int i = 0, j = 0, k = 0;
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] == 0)
                i++;
            else if (arr[l] == 1)
                j++;
            else
                k++;
        }
        // arrange the output
        int m = 0;
        while (i-- > 0) {
            arr[m++] = 0;
        }
        while (j-- > 0) {
            arr[m++] = 1;
        }
        while (k-- > 0) {
            arr[m++] = 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 0, 2, 1, 0, 1, 0 };
        // revA(arr);
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
