import java.lang.*;
import java.util.*;

class Solution{
    public int searchInsert(int[]nums,int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter the elements :");
        for(int i = 0;i <n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = n=sc.nextInt();
        Solution s = new Solution();
        int ans = s.searchInsert(nums,target);
        System.out.println(ans);
        sc.close();
    }
}
