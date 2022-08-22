import java.lang.*;
import java.util.*;

class Solution{
    public int removeDuplicates(int[]nums){
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int i = 0;
        for(int j = 0; j<nums.length -1 ; j++){
            if(nums[j] != nums[j+1]){
                nums[i] = nums[j];
                i++;
            }
        }
        nums[i++] = nums[nums.length-1];
        return i;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0; i <n; i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        n = sol.removeDuplicates(nums);
        System.out.println(n);
        for (int i=0; i<n; i++) {
        System.out.print(nums[i]+" ");  
        }
        sc.close();
    }
}