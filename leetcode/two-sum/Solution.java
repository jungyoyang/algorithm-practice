// ✅ 수정된 정답 풀이 (브루트포스 방식)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1}; // 예외 처리
    }
}