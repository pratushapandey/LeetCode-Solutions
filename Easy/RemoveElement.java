import java.lang.*;
import java.util.*;

class Solution{
    public int removeElements(int[]nums,int val){
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i]==val){
                nums[i] = nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array elements you want : ");
        int n = sc.nextInt();
        int[]nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be removed: ");
        int val = sc.nextInt();
        Solution s = new Solution();
        int ans = s.removeElements(nums,val);
        System.out.print("New no of arrays present in array : ");
        System.out.println(ans);
        System.out.println("The new array is : ");
        for(int i = 0; i<ans; i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}