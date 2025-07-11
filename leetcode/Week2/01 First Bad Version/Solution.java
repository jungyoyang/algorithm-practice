/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // mid도 불량 → 더 왼쪽에 첫 불량 버전 있을 수도 있음
                right = mid;
            } else {
                // mid는 정상 → 첫 불량 버전은 오른쪽에 있음
                left = mid + 1;
            }
        }

        // left == right가 되는 순간 → 첫 불량 버전
        return left;
    }
}
