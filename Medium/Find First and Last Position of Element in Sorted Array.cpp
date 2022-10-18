class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        vector<int>ans;
        ans.push_back(-1);
        ans.push_back(-1);
        
        if(nums.size() == 0 || target < nums[0] || target > nums[nums.size()-1])
            return ans;
        
        int x,indicator = 0;
        for(int i = 0; i < nums.size();i++){
            if(nums[i] == target){
                indicator++;
                x = i;
                break;
            }
        }
        
        int y = nums.size()-1;
        for(int j =nums.size()-1 ; j >=0 ;j--){
            if(nums[j] == target){
                y = j;
                break;
            }
        }
        
        if(indicator == 0)
            return ans;
        else{
            ans.clear();
            ans.push_back(x);
            ans.push_back(y);
            return ans;
        }
    }
};
