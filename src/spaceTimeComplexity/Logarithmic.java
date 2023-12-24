package spaceTimeComplexity;

public class Logarithmic {
    public static void main(String[] args) {
        //Binary Search

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right ) / 2;
            // Check if the target is present at the mid
            if (arr[mid] == target) {
                System.out.println(target + " found at Index : " + mid);
                break;
            }
            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
                System.out.println("left");
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
                System.out.println("right");
            }
        }
    }
}
