package Bitwise;
import java.util.Scanner;
//  Decimal to Binary Conversion
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int decimal = s.nextInt();
        String result ="";

        while(decimal>0){
            int rem = decimal%2;
            decimal = decimal/2;
            result= rem + result;
        }

        System.out.println("Binary :" + result);

    }
}
