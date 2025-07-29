class Solution{
    public static main(string args[]){        //지금은 메인을 하자는게아니다 int[] twoSum(int[] nums, int target)
        for (i=0; i<nums.length; i++){
            for(j=0; j<nums.length; j++){ // 중복 방지를 위해 j는 i+1부터
                if (target == nums[i] + nums[j])
                return int[i,j] //메소드 처음부분과 맞춰야한다 new int[] { i, j };
            }
        }
    }
}