import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // 1. 문자열 s의 각 문자의 개수를 센다.
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        // 2. 각 문자의 개수를 보며 팰린드롬 길이를 계산
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;  // 짝수는 전부 사용 가능
            } else {
                length += count - 1; // 홀수는 짝수만큼만 사용
                oddFound = true;     // 나중에 중앙에 하나 넣을 수 있음
            }
        }

        if (oddFound) length += 1; // 중앙에 홀수 하나 추가

        return length;
    }
}
