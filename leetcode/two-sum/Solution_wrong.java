class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) { //j는 i와 같지않다는 조건도 써야하는데..
                if(nums[i] + nums[j]==target) {
                    return new int[] {i,j};
                }
            }
            //You may assume that each input would have exactly one solution 이조건도 모르겠음.
        }
    }
    
    
    


}