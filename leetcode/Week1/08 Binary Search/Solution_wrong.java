public int search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            return i; // 찾았을 때 인덱스 반환
        }
    }
    return -1; // 못 찾으면 -1
}
