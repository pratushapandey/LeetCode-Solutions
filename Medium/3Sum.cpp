class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        sort(nums.begin(),nums.end());
        vector<vector<int>>ans;
        
        for(int i = 0; i <nums.size(); i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i+1, k = nums.size()-1;
            
            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    ans.push_back({nums[i],nums[j],nums[k]});
                    
                    int val1 = nums[j];
                    while(j<k && nums[j] == val1) j++;
                    
                    int val2 = nums[k];
                    while(j<k && nums[k] == val2) k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0)  j++;
                else if(nums[i]+nums[j]+nums[k]>0)  k--;
            }
        }
        return ans;
    }
};
