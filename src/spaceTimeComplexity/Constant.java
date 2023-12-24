package spaceTimeComplexity;

public class Constant {
    public static void main(String[] args) {
        //constant time complexity
        int [] arr = new int[]{1,3,4,5,6};
        arr[0]=arr[0]+10; // Time C. -> o(1)
        int num =arr[arr.length-1]; //Space C. -> o(4 bytes) -> o(4)
        System.out.println("num : " + num);
        System.out.println("arr[0] : " + arr[0]);
        // o(1) + o(1) = o(2) = o(1)  Constant Time Complexity
        // o(4bytes) =o(1)  Constant Space Complexity
    }
}
