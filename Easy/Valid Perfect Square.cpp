class Solution {
public:
    bool isPerfectSquare(int num) {
        
        if(num == 1) return true;
        
        int start = 1, high = num;
        
        while(start <= high){
            long int mid = start + (high-start)/2;
            
            if(mid*mid == num)
                return true;
            else if(mid*mid > num)
                 high = mid-1;
            else
                start = mid+1;
                
        }
        return false;
    }
};
