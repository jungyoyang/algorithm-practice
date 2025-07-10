class Solution {
    private int count = 0; // 전역 변수로 경우의 수 저장

    public int climbStairs(int n) {
        dfs(n);
        return count;
    }

    private void dfs(int remaining) {
        if (remaining < 0) return; // 잘못된 경로
        if (remaining == 0) {      // 정확히 도달
            count++;
            return;
        }

        dfs(remaining - 1); // 1계단
        dfs(remaining - 2); // 2계단
    }
}
