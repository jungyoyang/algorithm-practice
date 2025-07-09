public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. magazine에 있는 문자들을 카운트
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // 2. ransomNote를 하나씩 검사
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);  // 문자 하나 사용함
        }

        return true;
    }
}