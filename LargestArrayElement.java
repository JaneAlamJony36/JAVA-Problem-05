import java.util.Scanner;
public class LargestArrayElement {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n = input.nextInt();
     int[] arr = new int[n];
    System.out.println("Enter the  array elements: ");
     for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

    int max = arr[0];
    for (int i = 1; i < n; i++) {
          if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element of this Array is: " + max);
    }
}