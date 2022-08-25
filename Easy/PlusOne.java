import java.lang.*;
import java.util.*;

class Solution{
    public int[] plusOne(int[]digits){
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int []newNumber = new int[digits.length+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int n = sc.nextInt();
        System.out.println("Enter the digits :");
        int[]digits = new int[n];
        for(int i = 0; i< n; i++){
            digits[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int[] ans = s.plusOne(digits);
        System.out.println("New array : ");
        for(int i = 0; i< ans.length; i++){
            System.out.print(digits[i] + " ");
        }
        sc.close();
    }
}