import java.util.*;

public class Max_array {
    public int max_num(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size;
        System.out.println("Enter size of array:-");
        arr_size = sc.nextInt();
        int[] arr = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            System.out.println("Enter element at position:-" + i);
            arr[i] = sc.nextInt();
            System.out.println("You Entered:- " + arr[i]);
        }

        Max_array max = new Max_array();
        int maxNum = max.max_num(arr);
        System.out.println("Maximum number is:-" + maxNum);
    }
}
