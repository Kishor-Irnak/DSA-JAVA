public class Arrray_sum {
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // intrating each and every element in i through for loop
            sum += arr[i]; // sum = sum + arr[i];
        }
        System.out.println("Sum of array:-" + sum); // Displau Output
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Given array
        sum(arr); // Calling function
    }
}
