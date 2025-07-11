class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // 1. 문자 개수 세기
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        // 2. 팰린드롬에 사용할 수 있는 길이 계산
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // 짝수만큼만 더함
                oddFound = true;     // 홀수 하나는 중앙에 쓸 수 있음
            }
        }

        if (oddFound) length += 1;

        return length;
    }
}
