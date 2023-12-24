package spaceTimeComplexity;

public class Quad {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,0,4,10};
        int target=10;

        // Find the pair of Values in Array whose sum is equal to target
        for(int i=0; i<arr.length;i++){ // Time C. -> O(n)
            for (int j= i+1; j<arr.length;j++){ // Time C. ->O(n) times O(n) -> O(n^2)
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair :" + arr[i] + " " + arr[j] );
                }
            }
        }
    }
}
