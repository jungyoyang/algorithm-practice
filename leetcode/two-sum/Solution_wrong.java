import java.util.HashMap;
import java.util.Map; // 인터페이스

Map<int, int> hash = new HashMap<>();
int i;
int j;
int target;
target = i + j;
map.put(i, j);


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) { 
                if(nums[i] + nums[j]==target && i != j) {
                    return new int[] {i,j};
                }
            }
               

        }
        return new int[] {-1, -1};
    }
}